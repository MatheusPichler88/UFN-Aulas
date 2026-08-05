package aula02_lacos;
import java.util.Scanner;

public class MediaNumerosReais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        for (;;) {
            System.out.print("Digite um numero: ");
            double numero = sc.nextDouble();
            
            if (numero == 0) {
                break;
            }

            soma+= numero;
            contador++;
        }

        if (contador > 0) {
            System.out.println("Media: "+soma/contador);
        } else {
            System.out.println("Nenhum numero digitado");
        }

        sc.close();
    }
}
