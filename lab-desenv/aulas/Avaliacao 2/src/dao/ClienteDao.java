/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Cliente;
import conexao.Conexao;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author laboratorio
 */
public class ClienteDao {
    private Conexao conexao;
    private Connection conn;
    
    public ClienteDao() {
        this.conexao= new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO Cliente (nome, cpf, endereco, telefone) VALUES (?, ?, ?, ?);";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getTelefone());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
    }
    
    public ArrayList<Cliente> getClientes(String nomeCliente) {
         String sql = "SELECT * FROM Cliente WHERE nome LIKE ?;";
         
         try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, "%"+nomeCliente+"%");
                ResultSet rs = stmt.executeQuery();
                ArrayList<Cliente> clientes = new ArrayList();
                
                while(rs.next()) {
                    String nome = rs.getString("nome");
                    String cpf = rs.getString("cpf");
                    String endereco = rs.getString("endereco");
                    String telefone = rs.getString("telefone");
                    
                    Cliente c = new Cliente();
                    c.setNome(nome);
                    c.setCpf(cpf);
                    c.setEndereco(endereco);
                    c.setTelefone(telefone);
                    //TODO: Adicionar na lista clientes
                    clientes.add(c);
                }
                return clientes;
                
        } catch (Exception e) {
             System.out.println("Erro ao obter clientes: " + e.getMessage());
             return null;
        }
    }
}
