package aula02_lacos;
import java.util.Scanner;

public class MediaNotasVetor {
    public static void main(String[] args) {
        int[] notas = new int[5];
        int soma = 0;
        double media;
        Scanner teclado = new Scanner(System.in);


        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota " + (i+1) + ": ");
            notas[i] = teclado.nextInt();
            soma += notas[i];
        }

        teclado.close();


        media = (double) soma / notas.length;


        System.out.println("\nMédia:" + media);
    }
}