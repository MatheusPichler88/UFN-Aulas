package Aula_9.Ex4;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);
        conta.depositar(500.0);
        System.out.println("Saldo atual: " + conta.getSaldo());
        Cheque cheque = new Cheque(1500.0);
        conta.depositar(cheque);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
