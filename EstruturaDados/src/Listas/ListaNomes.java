//Crie um programa que peça 5 nomes ao usuário, guarde-os em uma lista e depois mostre todos os nomes digitados.
package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ListaNomes = new ArrayList<>();

        for(int i = 0; i<5; i++){
            System.out.println("Digite um nome: ");
            ListaNomes.add(sc.nextLine());
        }
        System.out.println(ListaNomes);
    }
}
