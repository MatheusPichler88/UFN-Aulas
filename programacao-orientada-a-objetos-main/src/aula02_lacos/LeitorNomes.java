package aula02_lacos;
import java.util.Scanner;

public class LeitorNomes {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        Scanner teclado = new Scanner(System.in);

        
        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite um nome: ");
            nomes[i] = teclado.nextLine();
        }

        
        System.out.println("\nNomes:");

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}