/* Crie um programa em Java que:
   - Gere uma lista de números inteiros aleatórios entre 0 e 49, com tamanho entre 10 e 14, garantindo que não haja números repetidos.
   - Ordene automaticamente os números em ordem crescente.
   - Exiba a lista ordenada na tela.
   - Remova o número 15 da lista, caso esteja presente.
   - Substitua todos os números ímpares por -1.
   - Exiba a lista modificada na tela.
 */

package Projetos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ManipulacaoNomesLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ListaNumeros = new ArrayList<>();
        Random gerador = new Random();

        //Gerador de números aleatórios
        int tamanho = gerador.nextInt(10, 15); //Gera o tamanho da lista

        for(int i = 0; i<tamanho; i++){ //Adiciona o tamanho da lista no ArrayList
            ListaNumeros.add(gerador.nextInt(0, 50));
        }

        //Ordena a lista em ordem crescente
        ListaNumeros.sort(null);
        System.out.println(ListaNumeros);
        if(ListaNumeros.contains(15)){
            ListaNumeros.remove(15);
    }
        //Substituição de numeros
        System.out.println("Substituindo impares...");
        for(int i=1; i<ListaNumeros.size(); i++){
            if(ListaNumeros.get(i)%2 != 0){
                ListaNumeros.set(i, -1);
            }
        }
        System.out.println(ListaNumeros);
        sc.close();
    }
}
