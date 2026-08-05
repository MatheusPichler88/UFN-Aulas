//Peça ao usuário para inserir alguns nomes em uma lista. Depois, pergunte um nome específico e diga se ele está ou não na lista.
package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscaNomeNaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ListaNomes = new ArrayList<>();
        for(int i = 0; i<5; i++){
            System.out.println("Digite um nome: ");
            ListaNomes.add(sc.nextLine());
        }
        System.out.println("Digite um nome para saber se esta na lista:");
        String nome = sc.nextLine();
            if(ListaNomes.contains(nome)){
                System.out.println("O nome já está na lista");
            }
            else{
                System.out.println("O nome não está na lista:");
            }
            sc.close();
        }
}

