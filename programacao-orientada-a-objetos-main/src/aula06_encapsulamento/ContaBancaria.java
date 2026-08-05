package aula06_encapsulamento;

public class ContaBancaria {

    private double saldo;
    private double limite;

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saque não realizado.");
        }
    }



}
