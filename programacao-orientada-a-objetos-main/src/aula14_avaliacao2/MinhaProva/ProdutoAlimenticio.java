package Prova;

import java.util.List;

public class ProdutoAlimenticio extends Produto {

    public ProdutoAlimenticio(List<String> nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void calcularPrecoFinal() {
        setDesconto(1.50);
        System.out.println("Produtos com validade proximas");
        double descontoFinal = getDesconto();
        double preco = getPreco();
        double precoFinal = preco - descontoFinal;
        setPreco(precoFinal);
        System.out.println("Os produtos com validade proximas obtiveram um desconto de R$ : "+getDesconto()+"\nO Valor final dos produtos é de R$: " + precoFinal);
    }
    }

