/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Veiculo;
import conexao.Conexao;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author laboratorio
 */
public class VeiculoDAO {
    private Conexao conexao;
    private Connection conn;
    
    public VeiculoDAO() {
        this.conexao= new Conexao();
        this.conn = this.conexao.getConexao();
    }
    public void inserirVeiculo(Veiculo veiculo) {
    String sql = "INSERT INTO Veiculo (marca, modelo, ano, placa, cor) VALUES (?, ?, ?, ?, ?)";
    
    try {
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, veiculo.getMarca());
        stmt.setString(2, veiculo.getModelo());
        stmt.setInt(3, Integer.parseInt(veiculo.getAnoFabricacao())); // Converter para int
        stmt.setString(4, veiculo.getPlaca());
        stmt.setString(5, veiculo.getCor()); // Adicionar cor
        stmt.execute();
        
    } catch (Exception e) {
        System.out.println("Erro ao inserir o veiculo: " + e.getMessage());
    }
}
}
