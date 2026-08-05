package aula12_relacionamento_listas;
//Crie uma classe Produto com os atributos nome e preco.
//Em outra classe, crie um método criarProdutoDesconto(String nome, double preco) que retorna um objeto Produto com 10% de desconto aplicado ao preço.
public class MainProdutoDesconto {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular",2500);
        System.out.println("Produto sem desconto:");
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());

        ProdutoDesconto produtoDesconto = new ProdutoDesconto();
        Produto p = produtoDesconto.criarProdutoDesconto("Celular", 2500);
        System.out.println("Produto com desconto:");
        System.out.println(p.getNome());
        System.out.println(p.getPreco());

    }
}
