/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import beans.Professor;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

public class ProfessorDao {
    private Conexao conexao;
    private Connection conn;
    
    public ProfessorDao() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Professor professor) {
        String sql = "INSERT INTO professores(nome, idade, disciplina) VALUES (?, ?, ?);";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, professor.getNome());
            stmt.setInt(2, professor.getIdade());
            stmt.setString(3, professor.getDisciplina());
            
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir professor: " + e.getMessage());
        }
    }
    
    public Professor getProfessor(int id) {
        String sql = "SELECT * FROM professores WHERE id = ?;";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(); //Obtenho o retorno da consulta e armazeno aqui
            Professor p = new Professor();
            
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setIdade(rs.getInt("idade"));
            p.setDisciplina("disciplina");
            return p;
            
        } catch (Exception e) {
            System.out.println("Erro ao consultar professor: " + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Professor> getProfessores() {
        String sql = "SELECT * FROM professores;";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery();
            ArrayList<Professor> listaProfessors = new ArrayList();
            
            while (rs.next()) {
                Professor p = new Professor();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setIdade(rs.getInt("idade"));
                p.setDisciplina(rs.getString("disciplina"));
                listaProfessors.add(p);
            }
            
            return listaProfessors;
            
        } catch (SQLException e) {
            System.out.println("Erro ao consultar todos os professores: " + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Professor> getProfessoresNome(String nome) {
        String sql = "SELECT * FROM professores WHERE nome LIKE ?;";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, "%"+nome+"%");
            
            ResultSet rs = stmt.executeQuery();
            ArrayList<Professor> listaProfessors = new ArrayList();
            
            while (rs.next()) {
                Professor p = new Professor();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setIdade(rs.getInt("idade"));
                p.setDisciplina(rs.getString("disciplina"));
                listaProfessors.add(p);
            }
            
            return listaProfessors;
            
        } catch (SQLException e) {
            System.out.println("Erro ao consultar todos os professores: " + e.getMessage());
            return null;
        }
    }
   
    
    public void editar (Professor professor) {
        String sql = "UPDATE professores SET nome=?, idade=?, disciplina=? WHERE id=?;";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, professor.getNome());
            stmt.setInt(2, professor.getIdade());
            stmt.setString(3, professor.getDisciplina());
            stmt.setInt(4, professor.getId());
            
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar professor: " + e.getMessage());
        }
    }
    
    public void excluir(int id) {
        String sqlDeleteMatriculas = "DELETE FROM matriculas WHERE id_professor=?";
        String sqlDeleteProfessor = "DELETE FROM professores WHERE id=?";

        try {
            PreparedStatement stmtMatriculas = conn.prepareStatement(sqlDeleteMatriculas);
            stmtMatriculas.setInt(1, id);
            stmtMatriculas.execute();
            stmtMatriculas.close();

            PreparedStatement stmtProfessor = conn.prepareStatement(sqlDeleteProfessor);
            stmtProfessor.setInt(1, id);
            stmtProfessor.execute();
            stmtProfessor.close();

            System.out.println("Professor excluído com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir professor: " + ex.getMessage());
        }
    }
}
