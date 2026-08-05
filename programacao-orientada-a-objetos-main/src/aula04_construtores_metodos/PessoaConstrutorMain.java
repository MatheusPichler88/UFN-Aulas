package aula04_construtores_metodos;

import java.util.Scanner;

public class PessoaConstrutorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o construtor:");
        System.out.println("1 - Nome e Idade");
        System.out.println("2 - Apenas Idade");

        int escolha = sc.nextInt();
        sc.nextLine();

        if (escolha == 1) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            PessoaConstrutor p1 = new PessoaConstrutor(nome, idade);
        } else if (escolha == 2) {
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            PessoaConstrutor p2 = new PessoaConstrutor(idade);
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
