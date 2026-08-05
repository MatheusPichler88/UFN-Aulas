package aula01_condicionais;
import java.util.Scanner;

public class VerificaMultiplos {
    public static void main(String[] args) {
        int n1, n2;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        n1 = teclado.nextInt();
        
        System.out.println("Digite o segundo valor:");
        n2 = teclado.nextInt();
        
        if (n1 % n2 == 0) {
            System.out.println(n1 + " eh multiplo de " + n2);
        } else if (n2 % n1 == 0) {
            System.out.println(n2 + " eh multiplo de " + n1);
        } else {
            System.out.println("Nao sao multiplos um do outro.");
        }
        
    }
}