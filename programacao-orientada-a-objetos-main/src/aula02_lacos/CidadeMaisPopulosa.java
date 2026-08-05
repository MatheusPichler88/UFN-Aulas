package aula02_lacos;
import java.util.Scanner;

public class CidadeMaisPopulosa {
    public static void main(String[] args) {
        String[] cidades = new String[5];
        int[] habitantes = new int[5];
        int maior = 0;
        int menor = 999999999;
        String cidadeMaior = "";
        String cidadeMenor = "";

        Scanner teclado = new Scanner(System.in);


        for(int i = 0; i < cidades.length; i++){
            System.out.println("Digite o nome da cidade " + (i+1) + ": ");
            cidades[i] = teclado.nextLine();
            System.out.println("Digite o número de habitantes da cidade " + cidades[i] + ": ");
            habitantes[i] = teclado.nextInt();
            teclado.nextLine();
            if(habitantes[i] > maior){
                maior = habitantes[i];
                cidadeMaior = cidades[i];
            }
            if(habitantes[i] < menor){
                menor = habitantes[i];
                cidadeMenor = cidades[i];
            }
        }

        teclado.close();

   
        System.out.println("\nMaior cidade: " + cidadeMaior + " com " + maior + " habitantes.");
        System.out.println("\nMenor cidade: " + cidadeMenor + " com " + menor + " habitantes.");
    }
}