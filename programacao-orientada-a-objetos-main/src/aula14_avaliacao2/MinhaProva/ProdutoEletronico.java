package Prova;

import java.util.List;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(List listaEletronico, double preco) {
        super(listaEletronico, preco);
    }

    @Override
    public void aplicarDesconto(double desconto) {
        double descontoFinal = desconto * 0.10;
        System.out.println("Desconto: " + descontoFinal);
        double novoPreco =getPreco() - descontoFinal;
        System.out.println("Pagamento a vista o valor dos produto é R$ " +novoPreco);
    }

    @Override
    public void calcularPrecoFinal() {
        double descontoGarantia = 3200;
        System.out.println("Garantia estendida de 2 anos");
        double novoValor = getPreco() + descontoGarantia;
        System.out.println("Com a garantia estendida o valor dos produtos passa a ser R$ "+novoValor);
    }
}
