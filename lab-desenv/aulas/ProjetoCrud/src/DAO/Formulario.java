package DAO;

import beans.Entidade;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Formulario extends JFrame {
    private JTextField txtId, txtNome, txtDescricao;
    private JTable tabela;
    private DefaultTableModel modeloTable;
    private JButton btnSalvar, btnEditar, btnExcluir, btnLimpar;
    private EntidadeDAO dao;
    
    public Formulario() {
        super("Cadastro de Entidades");
        dao = new EntidadeDAO();
        inicializarComponentes();
        configurarLayout();
        configurarEventos();
        carregarDados();
    }
    
    private void inicializarComponentes() {
        txtId = new JTextField(5);
        txtId.setEditable(false);
        txtNome = new JTextField(20);
        txtDescricao = new JTextField(20);
        
        btnSalvar = new JButton("Salvar");
        btnEditar = new JButton("Editar");
        btnExcluir = new JButton("Excluir");
        btnLimpar = new JButton("Limpar");
        
        // Configuração da tabela
        modeloTable = new DefaultTableModel();
        modeloTable.addColumn("ID");
        modeloTable.addColumn("Nome");
        modeloTable.addColumn("Descrição");
        
        tabela = new JTable(modeloTable);
        JScrollPane scrollPane = new JScrollPane(tabela);
    }
    
    private void configurarLayout() {
        setLayout(new BorderLayout(10, 10));
        
        // Painel de formulário
        JPanel painelForm = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        
        gbc.gridx = 0; gbc.gridy = 0;
        painelForm.add(new JLabel("ID:"), gbc);
        
        gbc.gridx = 1; gbc.gridy = 0;
        painelForm.add(txtId, gbc);
        
        gbc.gridx = 0; gbc.gridy = 1;
        painelForm.add(new JLabel("Nome:"), gbc);
        
        gbc.gridx = 1; gbc.gridy = 1;
        painelForm.add(txtNome, gbc);
        
        gbc.gridx = 0; gbc.gridy = 2;
        painelForm.add(new JLabel("Descrição:"), gbc);
        
        gbc.gridx = 1; gbc.gridy = 2;
        painelForm.add(txtDescricao, gbc);
        
        // Painel de botões
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnEditar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnLimpar);
        
        // Adicionando componentes ao frame
        add(painelForm, BorderLayout.NORTH);
        add(new JScrollPane(tabela), BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
        
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    private void configurarEventos() {
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvar();
            }
        });
        
        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editar();
            }
        });
        
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluir();
            }
        });
        
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });
        
        tabela.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                selecionarItemTabela();
            }
        });
    }
    
    private void salvar() {
        if (txtNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o nome!");
            return;
        }
        
        Entidade entidade = new Entidade();
        entidade.setNome(txtNome.getText());
        entidade.setDescricao(txtDescricao.getText());
        
        if (txtId.getText().isEmpty()) {
            // Novo registro
            dao.inserir(entidade);
            JOptionPane.showMessageDialog(this, "Entidade salva com sucesso!");
        } else {
            // Atualização
            entidade.setId(Integer.parseInt(txtId.getText()));
            dao.atualizar(entidade);
            JOptionPane.showMessageDialog(this, "Entidade atualizada com sucesso!");
        }
        
        limpar();
        carregarDados();
    }
    
    private void editar() {
        int linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um item para editar!");
            return;
        }
        
        int id = (int) modeloTable.getValueAt(linhaSelecionada, 0);
        Entidade entidade = dao.buscarPorId(id);
        
        if (entidade != null) {
            txtId.setText(String.valueOf(entidade.getId()));
            txtNome.setText(entidade.getNome());
            txtDescricao.setText(entidade.getDescricao());
        }
    }
    
    private void excluir() {
        int linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um item para excluir!");
            return;
        }
        
        int confirmacao = JOptionPane.showConfirmDialog(
            this, 
            "Tem certeza que deseja excluir este item?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION
        );
        
        if (confirmacao == JOptionPane.YES_OPTION) {
            int id = (int) modeloTable.getValueAt(linhaSelecionada, 0);
            dao.excluir(id);
            JOptionPane.showMessageDialog(this, "Entidade excluída com sucesso!");
            limpar();
            carregarDados();
        }
    }
    
    private void limpar() {
        txtId.setText("");
        txtNome.setText("");
        txtDescricao.setText("");
        tabela.clearSelection();
    }
    
    private void carregarDados() {
        modeloTable.setRowCount(0); // Limpa a tabela
        List<Entidade> entidades = dao.listarTodos();
        
        for (Entidade entidade : entidades) {
            modeloTable.addRow(new Object[]{
                entidade.getId(),
                entidade.getNome(),
                entidade.getDescricao()
            });
        }
    }
    
    private void selecionarItemTabela() {
        int linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada != -1) {
            txtId.setText(modeloTable.getValueAt(linhaSelecionada, 0).toString());
            txtNome.setText(modeloTable.getValueAt(linhaSelecionada, 1).toString());
            txtDescricao.setText(modeloTable.getValueAt(linhaSelecionada, 2).toString());
        }
    }
}