package Aula_9.Ex2;

public class ProdutoComDesconto extends Produto {
    private double percentualDesconto = 2.75;

    public ProdutoComDesconto() {
    }

    public ProdutoComDesconto(String tipo, double valor) {
        super(tipo, valor);
    }

    @Override
    public void desconto() {
        double valorDescontado = valor - percentualDesconto ;
        System.out.println("Valor do produto é de " +  valorDescontado);
    }
}
