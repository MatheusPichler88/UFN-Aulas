/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Aluno;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

public class AlunoDao {
    private Conexao conexao;
    private Connection conn;
    
    public AlunoDao() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Aluno aluno) {
        String sql = "INSERT INTO alunos(nome, idade, curso) VALUES (?, ?, ?);";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getCurso());
            
            stmt.execute();
            
            
        } catch (Exception e) {
            System.out.println("Erro ao inserir aluno: "+e.getMessage());
        }
    }
    
    public Aluno getAluno(int id) {
        String sql = "SELECT * FROM alunos WHERE id = ?";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(); //Obtenho o retorno da consulta e armazeno aqui
            Aluno a = new Aluno();
            rs.first();
            a.setId(id);
            a.setNome(rs.getString("nome"));
            a.setIdade(rs.getInt("idade"));
            a.setCurso("curso");
            return a;
            
        } catch (Exception e) {
            System.out.println("Erro ao consultar aluno: " + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Aluno> getAlunos() {
        String sql = "SELECT * FROM alunos;";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery();
            ArrayList<Aluno> listaAlunos = new ArrayList();
            
            while (rs.next()) {
                Aluno a = new Aluno();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setIdade(rs.getInt("idade"));
                a.setCurso(rs.getString("curso"));
                listaAlunos.add(a);
            }
            
            return listaAlunos;
            
        } catch (SQLException e) {
            System.out.println("Erro ao consultar todos os alunos: " + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Aluno> getAlunosNome(String nome) {
        String sql = "SELECT * FROM alunos WHERE nome LIKE ?;";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, "%"+nome+"%");
            ResultSet rs = stmt.executeQuery();
            ArrayList<Aluno> listaAlunos = new ArrayList();
            
            while (rs.next()) {
                Aluno a = new Aluno();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setIdade(rs.getInt("idade"));
                a.setCurso(rs.getString("curso"));
                listaAlunos.add(a);
            }
            
            return listaAlunos;
            
        } catch (SQLException e) {
            System.out.println("Erro ao consultar todos os alunos: " + e.getMessage());
            return null;
        }
    }
    
    public void editar(Aluno aluno) {
        String sql = "UPDATE alunos SET nome=?, idade=?, curso=? WHERE id=?";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getCurso());
            stmt.setInt(4, aluno.getId());
            
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar aluno: " + e.getMessage());
        }
    }
    
    public void excluir(int id) {
        String sqlDeleteMatriculas = "DELETE FROM matriculas WHERE id_aluno=?";
        String sqlDeleteAluno = "DELETE FROM alunos WHERE id=?";

        try {

            PreparedStatement stmtMatriculas = conn.prepareStatement(sqlDeleteMatriculas);
            stmtMatriculas.setInt(1, id);
            stmtMatriculas.execute();
            stmtMatriculas.close();


            PreparedStatement stmtAluno = conn.prepareStatement(sqlDeleteAluno);
            stmtAluno.setInt(1, id);
            stmtAluno.execute();
            stmtAluno.close();

            System.out.println("Aluno excluído com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir Aluno: " + ex.getMessage());
        }
    }
    
}
