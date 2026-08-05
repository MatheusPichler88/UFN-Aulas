package aula04_construtores_metodos;

import java.util.Scanner;

public class LivroEmprestimoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Título do livro: ");
        String titulo = sc.nextLine();

        System.out.print("Autor do livro: ");
        String autor = sc.nextLine();

        System.out.print("Ano de publicação: ");
        int anoPublicacao = sc.nextInt();
        sc.nextLine();

        System.out.print("Gênero do livro: ");
        String genero = sc.nextLine();

        LivroEmprestimo livro = new LivroEmprestimo(titulo, autor, anoPublicacao, genero);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Emprestar livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Ver informações do livro");
            System.out.println("4. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (livro.emprestado) {
                        System.out.println("O livro já está emprestado.");
                    } else {
                        livro.emprestado = true;
                        System.out.println("Livro emprestado com sucesso.");
                    }
                    break;
                case 2:
                    if (livro.emprestado) {
                        livro.emprestado = false;
                        System.out.println("Livro devolvido com sucesso.");
                    } else {
                        System.out.println("O livro não está emprestado.");
                    }
                    break;
                case 3:
                    System.out.println("\nInformações do livro:");
                    System.out.println("Título: " + livro.titulo);
                    System.out.println("Autor: " + livro.autor);
                    System.out.println("Ano de publicação: " + livro.anoPublicacao);
                    System.out.println("Gênero: " + livro.genero);
                    System.out.println("Emprestado: " + (livro.emprestado ? "Sim" : "Não"));
                    break;
                case 4:
                    System.out.println("Terminando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        sc.close();
    }
}
