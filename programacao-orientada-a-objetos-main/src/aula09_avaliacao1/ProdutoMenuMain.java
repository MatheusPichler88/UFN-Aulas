package aula09_avaliacao1;

import java.util.Scanner;

public class ProdutoMenuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoComMenu p = null;

        int op = 1;
        while (op != 0) {
            System.out.println("------------Menu-----------");
            System.out.println("1-Criar produto informando nome");
            System.out.println("2-Criar produto informando nome e preço");
            System.out.println("3-Exibir informações do produto");
            System.out.println("4-Atribuir nome do produto");
            System.out.println("5-Obter nome do produto");
            System.out.println("6-Atribuir preço do produto");
            System.out.println("7-Obter preço do produto");
            System.out.println("8-Atribuir quantidade em estoque");
            System.out.println("9-Obter quantidade em estoque");
            System.out.println("0-Sair");

            System.out.print("Digite a opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    p = new ProdutoComMenu(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    p = new ProdutoComMenu(nome, preco);
                    break;

                case 3:
                    if (p != null) {
                        System.out.println("Exibindo informações do produto:");
                        p.exibirInformacoes();
                    } else {
                        System.out.println("Produto ainda não criado.");
                    }
                    break;

                case 4:
                    if (p != null) {
                        System.out.print("Digite o nome do produto: ");
                        p.setNome(sc.nextLine());
                    } else {
                        System.out.println("Produto ainda não criado.");
                    }
                    break;

                case 5:
                    if (p != null) {
                        System.out.println("Nome: " + p.getNome());
                    } else {
                        System.out.println("Produto ainda não criado.");
                    }
                    break;

                case 6:
                    if (p != null) {
                        System.out.print("Digite o preço do produto: ");
                        p.setPreco(sc.nextDouble());
                        sc.nextLine();
                    } else {
                        System.out.println("Produto ainda não criado.");
                    }
                    break;

                case 7:
                    if (p != null) {
                        System.out.println("Preço: " + p.getPreco());
                    } else {
                        System.out.println("Produto ainda não criado.");
                    }
                    break;

                case 8:
                    if (p != null) {
                        System.out.print("Digite a quantidade em estoque: ");
                        p.setQuantidadeEstoque(sc.nextInt());
                        sc.nextLine();
                    } else {
                        System.out.println("Produto ainda não criado.");
                    }
                    break;

                case 9:
                    if (p != null) {
                        System.out.println("Quantidade em estoque: " + p.getQuantidadeEstoque());
                    } else {
                        System.out.println("Produto ainda não criado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        sc.close();
    }
}
