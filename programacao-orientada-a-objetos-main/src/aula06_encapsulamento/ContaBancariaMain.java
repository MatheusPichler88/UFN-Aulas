package aula06_encapsulamento;

import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Digite o saldo: ");
            double saldo = sc.nextDouble();

            System.out.print("Digite o limite da conta: ");
            double limiteConta = sc.nextDouble();

            // Cria objeto aula06_encapsulamento.ContaBancaria
            ContaBancaria conta = new ContaBancaria(saldo, limiteConta);

            // Realiza um saque
            System.out.print("Digite o valor para saque: ");
            double valorSaque = sc.nextDouble();

            conta.sacar(valorSaque);

            sc.close();
        }
    }
