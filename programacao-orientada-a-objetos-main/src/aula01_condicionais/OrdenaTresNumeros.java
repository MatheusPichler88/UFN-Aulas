package aula01_condicionais;
import java.util.Scanner;

public class OrdenaTresNumeros {
    public static void main(String[] args) {
        int n1, n2, n3, temporaria;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero:");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero:");
        n2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero:");
        n3 = teclado.nextInt();
        
        if (n1 > n2) {
            temporaria = n1;
            n1 = n2;
            n2 = temporaria;
        }
        
        if (n1 > n3) {
            temporaria = n1;
            n1 = n3;
            n3 = temporaria;
        }
        
        if (n2 > n3) {
            temporaria = n2;
            n2 = n3;
            n3 = temporaria;
        }
        
        System.out.println("Os numeros sao: " + n1+"," + n2+ ","+ n3);
    
    }
}

