package Aula_9.Ex2;

public class Produto {
    protected String tipo;
    protected double valor;

    public Produto() {
    }

    public Produto(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void desconto() {
        System.out.println("Valor do produto (" + tipo + "): R$ " + valor);
    }
}
