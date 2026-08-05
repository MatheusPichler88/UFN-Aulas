package Aula_9.Ex5;

public class Produto {
    public double calcularPrecoFinal(double preco) {
        return preco;
    }
    public double calcularPrecoFinal(double preco, Cliente cliente) {
        if (cliente != null) {
            double desconto = cliente.getDesconto();
            double precoComDesconto = preco - (preco * desconto / 100);
            return precoComDesconto;
        } else {
            return preco;
        }
    }
}