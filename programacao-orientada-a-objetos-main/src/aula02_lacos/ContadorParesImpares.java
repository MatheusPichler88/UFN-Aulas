package aula02_lacos;
import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        Scanner teclado = new Scanner(System.in);


        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número " + (i+1) + ": ");
            numeros[i] = teclado.nextInt();
            if(numeros[i] % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        teclado.close();


        System.out.println("\nPares: " + pares);
        System.out.println("\nÍmpares: " + impares);
    }
}