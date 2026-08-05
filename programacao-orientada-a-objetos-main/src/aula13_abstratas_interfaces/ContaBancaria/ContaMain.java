package aula13_abstratas_interfaces.ContaBancaria;

public class ContaMain {
    public static void main(String[] args) {
        //aula06_encapsulamento.ContaBancaria.Conta Corrente
        System.out.println("------------aula06_encapsulamento.ContaBancaria.Conta Corrente----------");
        Conta contaCorrente = new ContaCorrente(3500, 5000);
        contaCorrente.depositar(700);
        contaCorrente.sacar(1200);
        System.out.println("Saldo atual: " + contaCorrente.getSaldo());

        //aula06_encapsulamento.ContaBancaria.Conta Investimento
        System.out.println("------------aula06_encapsulamento.ContaBancaria.Conta Investimento----------");
        Conta contaInvestimento = new ContaInvestimento(17237, 0);
        contaInvestimento.depositar(2300);
        contaInvestimento.sacar(500);
        System.out.println("Saldo atual: " + contaInvestimento.getSaldo());
    }
}
