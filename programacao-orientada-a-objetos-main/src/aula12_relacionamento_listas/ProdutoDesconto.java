package aula12_relacionamento_listas;

public class ProdutoDesconto {

    public Produto criarProdutoDesconto(String nome, double preco){
        double produtoDesconto = preco-(preco*0.1);
        return new Produto(nome, produtoDesconto);
    }

}
