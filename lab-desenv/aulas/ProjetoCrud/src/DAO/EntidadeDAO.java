package DAO;

import beans.Entidade;
import conexao.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntidadeDAO {
    
    // CREATE - Inserir nova entidade
    public void inserir(Entidade entidade) {
        String sql = "INSERT INTO entidade (nome, descricao) VALUES (?, ?)";
        
        try (Connection conexao = ConexaoBD.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
            stmt.setString(1, entidade.getNome());
            stmt.setString(2, entidade.getDescricao());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir entidade: " + e.getMessage());
        }
    }
    
    // READ - Listar todas as entidades
    public List<Entidade> listarTodos() {
        List<Entidade> entidades = new ArrayList<>();
        String sql = "SELECT * FROM entidade";
        
        try (Connection conexao = ConexaoBD.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Entidade entidade = new Entidade();
                entidade.setId(rs.getInt("id"));
                entidade.setNome(rs.getString("nome"));
                entidade.setDescricao(rs.getString("descricao"));
                entidades.add(entidade);
            }
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar entidades: " + e.getMessage());
        }
        
        return entidades;
    }
    
    // READ - Buscar entidade por ID
    public Entidade buscarPorId(int id) {
        Entidade entidade = null;
        String sql = "SELECT * FROM entidade WHERE id = ?";
        
        try (Connection conexao = ConexaoBD.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    entidade = new Entidade();
                    entidade.setId(rs.getInt("id"));
                    entidade.setNome(rs.getString("nome"));
                    entidade.setDescricao(rs.getString("descricao"));
                }
            }
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar entidade: " + e.getMessage());
        }
        
        return entidade;
    }
    
    // UPDATE - Atualizar entidade
    public void atualizar(Entidade entidade) {
        String sql = "UPDATE entidade SET nome = ?, descricao = ? WHERE id = ?";
        
        try (Connection conexao = ConexaoBD.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
            stmt.setString(1, entidade.getNome());
            stmt.setString(2, entidade.getDescricao());
            stmt.setInt(3, entidade.getId());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar entidade: " + e.getMessage());
        }
    }
    
    // DELETE - Excluir entidade
    public void excluir(int id) {
        String sql = "DELETE FROM entidade WHERE id = ?";
        
        try (Connection conexao = ConexaoBD.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir entidade: " + e.getMessage());
        }
    }
}