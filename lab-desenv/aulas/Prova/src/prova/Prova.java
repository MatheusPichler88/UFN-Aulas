/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova;

import DAO.Conexao;
import java.sql.*;
/**
 *
 * @author laboratorio
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexao c = new Conexao();
        Connection con = c.getConexao();
        
        /*comandos sql para criar a base de dados
        create database estacionamento;
        use estacionamento;
        create table Veiculo (
id INT AUTO_INCREMENT PRIMARY KEY,
marca VARCHAR(50),
modelo VARCHAR(50),
ano INT,
placa VARCHAR(10),
cor VARCHAR(20));
        */
    }
    
}
