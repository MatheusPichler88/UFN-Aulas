/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author laboratorio
 */
public class Conexao {
    public Connection getConexao(){
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/estacionamento?useTimeZone=true&serverTimeZone=UTC",
                    "root","laboratorio");
            System.out.println("Conexão efetuada!");
            return conn;
        } catch (SQLException ex) {
            System.out.println("Erro ao efetuar conexão: "+ex.getMessage());
            return null;
        }
    }
}
