package aula02_lacos;
import java.util.Scanner;

public class FatorialComLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double fatorial = 1;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial eh: " +fatorial);
        sc.close();
    }
}
