/*Crie um programa em Java que:

   - Permita ao usuário inserir 5 números inteiros em uma lista.
   - Ordene automaticamente os números em ordem crescente.
   - Exiba a lista ordenada na tela.
 */
package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ListaNumeros = new ArrayList<>();

        for(int i = 0; i<5; i++){
            System.out.println("Digite um numero: ");
            ListaNumeros.add(sc.nextInt());
        }
        ListaNumeros.sort(null);
        System.out.println(ListaNumeros);
        sc.close();

    }
}
