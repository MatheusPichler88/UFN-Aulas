package aula04_construtores_metodos;

import java.util.Scanner;

public class AlunoConstrutorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno 1: ");
        String nome1 = sc.nextLine();
        System.out.print("Matrícula do aluno 1: ");
        String matricula1 = sc.nextLine();
        AlunoConstrutor aluno1 = new AlunoConstrutor(nome1, matricula1);

        System.out.print("Data de nascimento do aluno 2: ");
        String dataNasc2 = sc.nextLine();
        AlunoConstrutor aluno2 = new AlunoConstrutor(dataNasc2);

        System.out.print("Nome do aluno 3: ");
        String nome3 = sc.nextLine();
        System.out.print("Data de nascimento do aluno 3: ");
        String dataNasc3 = sc.nextLine();
        System.out.print("Ano de ingresso do aluno 3: ");
        int anoIngresso3 = sc.nextInt();
        AlunoConstrutor aluno3 = new AlunoConstrutor(nome3, dataNasc3, anoIngresso3);

        sc.close();
    }
}
