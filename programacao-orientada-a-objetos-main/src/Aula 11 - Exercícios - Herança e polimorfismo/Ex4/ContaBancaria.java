package Aula_9.Ex4;

public class ContaBancaria {
    private double saldo;
    public ContaBancaria() {
        this.saldo = 0.0;
    }
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito: " + valor);
        } else {
            System.out.println("Não é possível realizar essa operação.");
        }
    }
    public void depositar(Cheque cheque) {
        if (cheque != null && cheque.getValor() > 0) {
            saldo += cheque.getValor();
            System.out.println("Depósito com cheque: " + cheque.getValor());
        } else {
            System.out.println("Cheque náo é válido");
        }
    }
    public double getSaldo() {
        return saldo;
    }
}