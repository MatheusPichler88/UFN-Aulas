/*Crie um programa onde o usuário insere nomes na lista. Depois, ele pode digitar um nome para ser removido.
 Exiba a lista antes e depois da remoção.
 */
package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveNomeLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ListaNomes = new ArrayList<>();

        for(int i = 0; i<5; i++){
            System.out.println("Digite um nome: ");
            ListaNomes.add(sc.nextLine());
        }
        System.out.println("Digite um nome para ser removido: ");
        String nome = sc.nextLine();
        ListaNomes.remove(nome);
        System.out.println(ListaNomes);
        sc.close();
    }
}
