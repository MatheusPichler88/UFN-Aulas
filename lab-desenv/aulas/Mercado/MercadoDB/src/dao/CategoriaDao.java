/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import conexao.Conexao;
import java.sql.Connection;
import beans.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoriaDao {
    private Conexao conexao;
    private Connection conn;
    
    public CategoriaDao(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Categoria categoria) {
        String sql = "INSERT INTO categorias(nome) VALUES (?);";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println("Erro ao inserir na tabela categorias" + e.getMessage());
        }
    }
    
    public ArrayList<Categoria> getCategorias() {
        String sql = "SELECT * FROM categorias";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(); 
            ArrayList<Categoria> listaCategorias = new ArrayList();
            
            while(rs.next()) {
                String nome = rs.getString("nome");
                int id = rs.getInt("id");
                Categoria c = new Categoria(id, nome);
                
                listaCategorias.add(c);
            }
            return listaCategorias;
        } catch (Exception e) {
            System.out.println("Erro ao consultar categorias" + e.getMessage());
            return null;
        }
    }
    
    public Categoria getCategoria(int id) {
        String sql = "SELECT * FROM categorias WHERE id=?;";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
            stmt.setInt(1, id); 
            ResultSet rs = stmt.executeQuery();
            rs.first();
            
            String nome = rs.getString("nome");
            return new Categoria(id, nome);
        } catch (Exception e) {
            System.out.println("Erro ao consultar categoria: " + e.getMessage());
            return null;
        }
    }
}
