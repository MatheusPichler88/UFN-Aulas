
package mainPkg;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Conteudo extends javax.swing.JFrame {

    public boolean carIsSelected = true;
    
    public ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    
    public Conteudo() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 51, 255)); // Altere para a cor desejada
        rdoCarro.setSelected(true);
        rdoGasolina.setSelected(true);
        changeContent();
    }
    
    public void changeContent(){
        
        //carro
        lblNumeroPortas.setVisible(carIsSelected);
        cmbNumeroPortas.setVisible(carIsSelected);
        lblCapacidadePortaMalas.setVisible(carIsSelected);
        txtCapacidadePortaMalas.setVisible(carIsSelected);
        
        
        //moto
        lblCilindradas.setVisible(!carIsSelected);
        txtCilindrada.setVisible(!carIsSelected);
        lblTipoTransmissao.setVisible(true);
        rdoAutomatica.setVisible(true);
        rdoManual.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrp_Veiculo = new javax.swing.ButtonGroup();
        btnGrp_tipoTransmissao = new javax.swing.ButtonGroup();
        btnGrp_TipoCombustivel = new javax.swing.ButtonGroup();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblAnoFabricacao = new javax.swing.JLabel();
        txtAnoFabricacao = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        rdoCarro = new javax.swing.JRadioButton();
        rdoMoto = new javax.swing.JRadioButton();
        btnCalcularImposto = new javax.swing.JButton();
        lblNumeroPortas = new javax.swing.JLabel();
        cmbNumeroPortas = new javax.swing.JComboBox<>();
        lblCapacidadePortaMalas = new javax.swing.JLabel();
        txtCapacidadePortaMalas = new javax.swing.JTextField();
        lblCilindradas = new javax.swing.JLabel();
        txtCilindrada = new javax.swing.JTextField();
        rdoAutomatica = new javax.swing.JRadioButton();
        rdoManual = new javax.swing.JRadioButton();
        lblTipoTransmissao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rdoGasolina = new javax.swing.JRadioButton();
        rdoDiesel = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarros = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMotos = new javax.swing.JTable();
        lblValorBase = new javax.swing.JLabel();
        txtValorBase = new javax.swing.JTextField();
        lblCarro = new javax.swing.JLabel();
        lblMoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblModelo.setText("Modelo");

        lblMarca.setText("Marca");

        lblAnoFabricacao.setText("Ano de fabricação");

        lblPlaca.setText("Placa");

        btnGrp_Veiculo.add(rdoCarro);
        rdoCarro.setText("Carro");
        rdoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCarroActionPerformed(evt);
            }
        });

        btnGrp_Veiculo.add(rdoMoto);
        rdoMoto.setText("Moto");
        rdoMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMotoActionPerformed(evt);
            }
        });

        btnCalcularImposto.setText("Calcular imposto");
        btnCalcularImposto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularImpostoActionPerformed(evt);
            }
        });

        lblNumeroPortas.setText("Número de portas");

        cmbNumeroPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));

        lblCapacidadePortaMalas.setText("Capacidade do porta-malas");

        lblCilindradas.setText("Cilindradas");

        btnGrp_tipoTransmissao.add(rdoAutomatica);
        rdoAutomatica.setText("Automatica");

        btnGrp_tipoTransmissao.add(rdoManual);
        rdoManual.setText("Manual");

        lblTipoTransmissao.setText("Tipo de transmissão");

        jLabel1.setText("Tipo de combustivel");

        btnGrp_TipoCombustivel.add(rdoGasolina);
        rdoGasolina.setText("Gasolina");

        btnGrp_TipoCombustivel.add(rdoDiesel);
        rdoDiesel.setText("Diesel");

        tblCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "Ano de fabricação", "Tipo de combustivel", "Placa", "Número de portas", "Capacidade do porta-malas"
            }
        ));
        jScrollPane1.setViewportView(tblCarros);

        tblMotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "Ano de fabricação", "Tipo de combustivel", "Placa", "Cilindradas", "Tipo de transmissão"
            }
        ));
        jScrollPane2.setViewportView(tblMotos);

        lblValorBase.setText("Valor base");

        lblCarro.setText("Carro");

        lblMoto.setText("Moto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModelo)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMarca)
                                        .addGap(154, 154, 154)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoGasolina)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoDiesel))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnoFabricacao)
                                    .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNumeroPortas)
                                    .addComponent(cmbNumeroPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCapacidadePortaMalas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCapacidadePortaMalas)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPlaca)
                                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblValorBase)
                                            .addComponent(txtValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMoto)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCalcularImposto)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCilindradas))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTipoTransmissao)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rdoAutomatica)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdoManual)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoCarro)
                                .addGap(26, 26, 26)
                                .addComponent(rdoMoto))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoCarro)
                    .addComponent(rdoMoto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMarca)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdoGasolina)
                                    .addComponent(rdoDiesel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAnoFabricacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblValorBase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlaca)
                        .addGap(6, 6, 6)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroPortas)
                    .addComponent(lblCapacidadePortaMalas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNumeroPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapacidadePortaMalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCilindradas)
                    .addComponent(lblTipoTransmissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoAutomatica)
                    .addComponent(rdoManual))
                .addGap(18, 18, 18)
                .addComponent(btnCalcularImposto)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarro)
                    .addComponent(lblMoto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCarroActionPerformed
        carIsSelected = true;
        changeContent();
    }//GEN-LAST:event_rdoCarroActionPerformed

    private void rdoMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMotoActionPerformed
        carIsSelected = false;
        changeContent();
    }//GEN-LAST:event_rdoMotoActionPerformed

    private void btnCalcularImpostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularImpostoActionPerformed
        String tipoCombustivel = rdoGasolina.isSelected() ? "Gasolina" : "Diesel";
        
        if (txtAnoFabricacao.getText().isEmpty() ||
                txtModelo.getText().isEmpty() || txtPlaca.getText().isEmpty() || 
                txtMarca.getText().isEmpty()){
            System.out.println("Preencha todos os campos!");
            return;
        }
        
        if (carIsSelected){
            if (txtCapacidadePortaMalas.getText().isEmpty()){
                System.out.println("Preencha todos os campos!");
                return;
            }
            Carro carro = new Carro();
            carro.setModelo(txtModelo.getText());
            carro.setMarca(txtMarca.getText());
            carro.setAnoFabricacao(txtAnoFabricacao.getText());
            carro.setTipoCombustivel(tipoCombustivel);
            carro.setPlaca(txtPlaca.getText());
            carro.setNumeroPortas( Integer.parseInt((String)cmbNumeroPortas.getSelectedItem()));
            carro.setCapacidadePortaMalas( Double.parseDouble( txtCapacidadePortaMalas.getText()));
            veiculos.add(carro);
            
            DefaultTableModel tabela = (DefaultTableModel) tblCarros.getModel();
            tabela.addRow(carro.obterDados());
            carro.setValorBase(Integer.parseInt(txtValorBase.getText()));
            JOptionPane.showMessageDialog(null, "Imposto para carro: " + carro.calculaImposto());
            
        }
        else{
            Moto moto = new Moto();
            moto.setModelo(txtModelo.getText());
            moto.setMarca(txtMarca.getText());
            moto.setAnoFabricacao(txtAnoFabricacao.getText());
            moto.setTipoCombustivel(tipoCombustivel);
            moto.setPlaca(txtPlaca.getText());
            moto.setCilindradas(Integer.parseInt(txtCilindrada.getText()));
            String tipoTransmissao = rdoAutomatica.isSelected() ? "Automatica" : "Manual";
            moto.setTipoTransmissao(tipoTransmissao);
            veiculos.add(moto);
            
            DefaultTableModel tabela = (DefaultTableModel) tblMotos.getModel();
            tabela.addRow(moto.obterDados());
            
            moto.setValorBase(Integer.parseInt(txtValorBase.getText()));
            JOptionPane.showMessageDialog(null, "Imposto para moto: " + moto.calculaImposto());
        }
        
        txtModelo.setText("");
        txtMarca.setText("");
        txtAnoFabricacao.setText("");
        txtPlaca.setText("");
        txtValorBase.setText("");
        txtCapacidadePortaMalas.setText("");
        rdoGasolina.setSelected(true);
        
    }//GEN-LAST:event_btnCalcularImpostoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conteudo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularImposto;
    private javax.swing.ButtonGroup btnGrp_TipoCombustivel;
    private javax.swing.ButtonGroup btnGrp_Veiculo;
    private javax.swing.ButtonGroup btnGrp_tipoTransmissao;
    private javax.swing.JComboBox<String> cmbNumeroPortas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnoFabricacao;
    private javax.swing.JLabel lblCapacidadePortaMalas;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblCilindradas;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMoto;
    private javax.swing.JLabel lblNumeroPortas;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTipoTransmissao;
    private javax.swing.JLabel lblValorBase;
    private javax.swing.JRadioButton rdoAutomatica;
    private javax.swing.JRadioButton rdoCarro;
    private javax.swing.JRadioButton rdoDiesel;
    private javax.swing.JRadioButton rdoGasolina;
    private javax.swing.JRadioButton rdoManual;
    private javax.swing.JRadioButton rdoMoto;
    private javax.swing.JTable tblCarros;
    private javax.swing.JTable tblMotos;
    private javax.swing.JTextField txtAnoFabricacao;
    private javax.swing.JTextField txtCapacidadePortaMalas;
    private javax.swing.JTextField txtCilindrada;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValorBase;
    // End of variables declaration//GEN-END:variables
}
