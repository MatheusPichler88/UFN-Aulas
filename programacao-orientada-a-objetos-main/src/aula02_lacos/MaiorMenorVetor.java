package aula02_lacos;
import java.util.Scanner;

public class MaiorMenorVetor {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);

        int maior = 0;
        int menor = 999999999;


        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número " + (i+1) + ": ");
            numeros[i] = teclado.nextInt();
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        teclado.close();


        System.out.println("\nMaior: " + maior);
        System.out.println("\nMenor: " + menor);
    }
}