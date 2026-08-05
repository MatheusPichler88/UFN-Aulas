
package dao;
import conexao.Conexao;
import java.sql.Connection;
import beans.Produto;
import beans.Categoria;
import dao.CategoriaDao;
import java.sql.PreparedStatement; //Prepare statement
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDao {
    private Conexao conexao;
    private Connection conn;
    
    public ProdutoDao(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Produto produto) {
        String sql = "INSERT INTO produtos(nome, preco, quantidade, categoria_id) VALUES (?, ?, ?, ?);";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getCategoria().getId());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println("Erro ao inserir produto" + e.getMessage());
        }
    }
    
    public Produto getProduto(int id) {
        String sql = "SELECT * FROM produtos WHERE id=?;";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            
            String nome = rs.getString("nome");
            double preco = rs.getDouble("preco");
            int quantidade = rs.getInt("quantidade");
            int categoriaId = rs.getInt("categoria_id");
            CategoriaDao cDao = new CategoriaDao();
            Categoria categoria = cDao.getCategoria(categoriaId);
            
            return new Produto(nome, preco, quantidade, categoria);
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto" + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Produto> getProdutos() {
        String sql = "SELECT * FROM PRODUTOS;";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Produto> produtos = new ArrayList();
            
            while(rs.next()) {
                String nome = rs.getString("nome");
                double preco = rs.getDouble("preco");
                int quantidade = rs.getInt("quantidade");
                int categoriaId = rs.getInt("categoria_id");
                CategoriaDao cDao = new CategoriaDao();
                Categoria categoria = cDao.getCategoria(categoriaId);
                Produto produto = new Produto(nome, preco, quantidade, categoria);
                produtos.add(produto);
            }
            
            return produtos;
        } catch (Exception e) {
            System.out.println("Erro ao consultar produtos:" + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Produto> getProdutosPorNome(String nomeProduto) {
        String sql = "SELECT * FROM PRODUTOS WHERE nome LIKE ?;";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%"+nomeProduto+"%");
            ResultSet rs = stmt.executeQuery();
            ArrayList<Produto> produtos = new ArrayList();
            
            while(rs.next()) {
                String nome = rs.getString("nome");
                double preco = rs.getDouble("preco");
                int quantidade = rs.getInt("quantidade");
                int categoriaId = rs.getInt("categoria_id");
                CategoriaDao cDao = new CategoriaDao();
                Categoria categoria = cDao.getCategoria(categoriaId);
                Produto produto = new Produto(nome, preco, quantidade, categoria);
                produtos.add(produto);
            }
            
            return produtos;
        } catch (Exception e) {
            System.out.println("Erro ao consultar produtos:" + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Produto> getProdutosPorCategoria(String nomeProduto, int idProduto) {
        String sql = "SELECT * FROM PRODUTOS WHERE nome LIKE ? AND categoria_id=?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%"+nomeProduto+"%");
            stmt.setInt(2, idProduto);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Produto> produtos = new ArrayList();
            
            while(rs.next()) {
                String nome = rs.getString("nome");
                double preco = rs.getDouble("preco");
                int quantidade = rs.getInt("quantidade");
                int categoriaId = rs.getInt("categoria_id");
                CategoriaDao cDao = new CategoriaDao();
                Categoria categoria = cDao.getCategoria(categoriaId);
                Produto produto = new Produto(nome, preco, quantidade, categoria);
                produtos.add(produto);
            }
            
            return produtos;
        } catch (Exception e) {
            System.out.println("Erro ao consultar produtos por categoria:" + e.getMessage());
            return null;
        }
    }
    
    public void atualizar(Produto produto) {
        String sql = "UPDATE produtos SET nome=?, preco=?, quantidade=?, categoria_id=? WHERE id=?;";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getCategoria().getId());
            stmt.setInt(5, produto.getId());
            
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao atulizar produto: " + e.getMessage());
        }
    }
    
    public void deletar(int id) {
        String sql = "DELETE FROM produtos WHERE id=?;";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar produto: " + e.getMessage());
        }
    }
}
