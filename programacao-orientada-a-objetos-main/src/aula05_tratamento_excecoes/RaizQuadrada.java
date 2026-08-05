package aula05_tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um numero inteiro: ");
            int n = sc.nextInt();
            double raiz = Math.sqrt(n);
            System.out.println("" + raiz);
        } catch (InputMismatchException e) {
            System.out.println("Não foi digitado um numero inteiro!");
            sc.nextLine();
        }
        sc.close();
    }
}