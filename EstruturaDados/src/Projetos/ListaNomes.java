/* Crie um programa em Java que utilize um ArrayList para armazenar nomes de pessoas inseridos pelo usuário. O programa deve:
   - Ler até 5 nomes digitados pelo usuário, garantindo que não haja repetição.
   - Ordenar a lista em ordem alfabética.
   - Exibir a lista ordenada.
   - Permitir a exclusão de um nome informado pelo usuário.
   - Exibir a lista atualizada após a exclusão
*/
package Projetos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ListaNomes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um nome:");
            String nome = sc.nextLine();
            if (ListaNomes.contains(nome)) {
                System.out.println("Esse nome já está na lista!");
            } else {
                ListaNomes.add(nome);
            }
        }
        ListaNomes.sort(null);
        System.out.println(ListaNomes);

        System.out.println("Você deseja remover um nome da lista?");
        if(sc.nextLine().equalsIgnoreCase("Sim")){
            System.out.println("Digite o nome que deseja remover:");
            String nome = sc.nextLine();
            ListaNomes.remove(nome);
        }
        System.out.println(ListaNomes);
        sc.close();
    }
}
