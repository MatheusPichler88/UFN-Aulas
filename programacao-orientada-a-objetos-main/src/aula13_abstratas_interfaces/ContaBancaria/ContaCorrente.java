package aula13_abstratas_interfaces.ContaBancaria;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo()+valor);
        System.out.println("Foi depositado o valor de R$ "+valor+" reais na conta Corrente!");
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo()-valor);
        System.out.println("Foi sacado o valor de R$ "+valor+" reais na conta Corrente!");
    }
}
