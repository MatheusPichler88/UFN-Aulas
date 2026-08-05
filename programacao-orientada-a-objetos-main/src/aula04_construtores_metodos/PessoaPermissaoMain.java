package aula04_construtores_metodos;

import java.util.Scanner;

public class PessoaPermissaoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome 1: ");
        String n1 = sc.nextLine();
        System.out.print("Email 1: ");
        String e1 = sc.nextLine();
        System.out.print("Data Nasc 1: ");
        String d1 = sc.nextLine();
        System.out.print("Endereço 1: ");
        String en1 = sc.nextLine();

        PessoaPermissao p1 = new PessoaPermissao(n1, e1, d1, en1);

        System.out.print("Nome 2: ");
        String n2 = sc.nextLine();
        System.out.print("Email 2: ");
        String e2 = sc.nextLine();
        System.out.print("Data Nasc 2: ");
        String d2 = sc.nextLine();
        System.out.print("Endereço 2: ");
        String en2 = sc.nextLine();

        PessoaPermissao p2 = new PessoaPermissao(n2, e2, d2, en2);

        p1.promoverAdmin();

        System.out.println("\nPessoa 1:");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Email: " + p1.email);
        System.out.println("Data Nasc: " + p1.dataNasc);
        System.out.println("Endereço: " + p1.endereco);
        System.out.println("Admin: " + (p1.admin ? "Sim" : "Não"));

        System.out.println("\nPessoa 2:");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Email: " + p2.email);
        System.out.println("Data Nasc: " + p2.dataNasc);
        System.out.println("Endereço: " + p2.endereco);
        System.out.println("Admin: " + (p2.admin ? "Sim" : "Não"));

        sc.close();
    }
}
