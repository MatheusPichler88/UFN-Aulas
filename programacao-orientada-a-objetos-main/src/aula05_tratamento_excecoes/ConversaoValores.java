package aula05_tratamento_excecoes;

import java.util.Scanner;

public class ConversaoValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");

        try {
            double valor = sc.nextDouble();
            System.out.println("Valor digitado: " + valor);
        } catch (Exception e) {
            System.out.println("Digite um valor valido!");
        }
            sc.close();
        }
    }

