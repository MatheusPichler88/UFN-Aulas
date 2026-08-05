/*Peça para o usuário adicionar quantos nomes quiser na lista.
Quando ele parar de digitar, o programa deve mostrar quantos nomes foram adicionados.
 */
package Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class AdicionaNomeComParada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ListaNomes = new ArrayList<>();

        while(true){
            System.out.println("Digite um nome: ");
            String nome = sc.nextLine();
            if(nome.equalsIgnoreCase("Sair")){
                break;
            }
            else{
                ListaNomes.add(nome);
            }
            }
        System.out.println(ListaNomes);
    }
}