/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Disciplina;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

public class DisciplinaDao {
    private Conexao conexao;
    private Connection conn;
    
    public DisciplinaDao() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Disciplina disciplina){
        String sql = "INSERT INTO disciplinas(nome, cargaHoraria, id_professor) VALUES (?, ?, ?);";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, disciplina.getNome());
            stmt.setInt(2, disciplina.getCargaHoraria());
            stmt.setInt(3, disciplina.getIdProfessor());
            
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir disciplina: " + e.getMessage());
        }
    }
    
     public ArrayList<Disciplina> getDisciplinas() {
        String sql = "SELECT * FROM disciplinas;";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery();
            ArrayList<Disciplina> listaDisciplinas = new ArrayList();
            
            while (rs.next()) {
                Disciplina d = new Disciplina();
                d.setId(rs.getInt("id"));
                d.setNome(rs.getString("nome"));
                d.setCargaHoraria(rs.getInt("cargaHoraria"));
                d.setIdProfessor(rs.getInt("id_professor"));
                listaDisciplinas.add(d);
            }
            
            return listaDisciplinas;
            
        } catch (SQLException e) {
            System.out.println("Erro ao consultar todas as disciplinas: " + e.getMessage());
            return null;
        }
    }
}
