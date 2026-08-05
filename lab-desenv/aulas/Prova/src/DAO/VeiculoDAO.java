/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Beans.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author laboratorio
 */
public class VeiculoDAO {
    public Conexao conexao;
    public Connection conn;

    public VeiculoDAO() {
        this.conexao = new Conexao();
        conn = conexao.getConexao();
    }
    public void inserirVeiculo(Veiculo v){
        try {
            String sql = "INSERT INTO VEICULO (marca, modelo, ano, placa, cor) values (?, ?, ?, ?, ?);";
            
            PreparedStatement stmt  = this.conn.prepareStatement(sql);
            stmt.setString(1, v.getMarca());
            stmt.setString(2, v.getModelo());
            stmt.setInt(3, v.getAno());
            stmt.setString(4, v.getPlaca());
            stmt.setString(5, v.getCor());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex.getMessage());
        }
        
        
    }
}
