package aula05_tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraExcecoesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraExcecoes c = new CalculadoraExcecoes();

        int op;
        do {
            System.out.println("1-Soma");
            System.out.println("2-Subtracao");
            System.out.println("3-Multiplicação");
            System.out.println("4-Divisão");
            System.out.println("5-Sair");
            System.out.println("Opção: ");
            op = sc.nextInt();

            try {
                switch (op) {

                    case 1:
                        double[] SomaNumeros = c.obterNumeros();
                        double soma = c.soma(SomaNumeros[0], SomaNumeros[1]);
                        System.out.println("O resultado da soma: " + soma);
                        break;
                    case 2:
                        double[] SubNumeros = c.obterNumeros();
                        double sub = c.subtracao(SubNumeros[0], SubNumeros[1]);
                        System.out.println("O resultado da subtração: " + sub);
                        break;
                    case 3:
                        double[] MultNumeros = c.obterNumeros();
                        double mult = c.multiplicacao(MultNumeros[0], MultNumeros[1]);
                        System.out.println("O resultado da multiplicação: " + mult);
                        break;
                    case 4:
                        double[] DivNumeros = c.obterNumeros();
                        double div = c.divisao(DivNumeros[0], DivNumeros[1]);
                        System.out.println("O resultado da divisão: " + div);
                        break;
                    case 5:
                        System.out.println("Finalizando");
                        break;
                    default:
                        System.out.println("Opção invalida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor numérico!");
                sc.nextLine();
            }

        }
        while (op!=5);
        sc.close();
    }

}
