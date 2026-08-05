package aula04_construtores_metodos;

import java.util.Scanner;

public class DisciplinaMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Disciplina d = new Disciplina("Poo", 80, "Ricardo");

            System.out.println("Valores iniciais:");
            System.out.println("Disciplina: " + d.nome);
            System.out.println("Carga Horária: " + d.cargaHoraria + " horas");
            System.out.println("Professor: " + d.nomeProfessor);

            System.out.println("\nDigite os novos valores:");

            System.out.print("Nome da Disciplina: ");
            d.nome = sc.nextLine();

            System.out.print("Carga Horária: ");
            d.cargaHoraria = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome do Professor: ");
            d.nomeProfessor = sc.nextLine();

            System.out.println("\nNovos Valores:");
            System.out.println("Disciplina: " + d.nome);
            System.out.println("Carga Horária: " + d.cargaHoraria + " horas");
            System.out.println("Professor: " + d.nomeProfessor);

            sc.close();
        }
    }

