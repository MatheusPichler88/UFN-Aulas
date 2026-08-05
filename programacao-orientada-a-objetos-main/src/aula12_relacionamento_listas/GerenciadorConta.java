package aula12_relacionamento_listas;

public class GerenciadorConta {
    private String titular;
    private double saldo;

    public GerenciadorConta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(GerenciadorConta c, double valor){
        c.saldo += valor;
    }
    public void mostrarDados(){
        System.out.println("Titular: " + titular + ", Saldo: R$" + saldo);
    }
}
