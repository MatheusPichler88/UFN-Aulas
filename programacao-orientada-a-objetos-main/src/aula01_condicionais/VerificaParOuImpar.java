package aula01_condicionais;
import java.util.Scanner;

public class VerificaParOuImpar {
    public static void main(String[] args) {
	    int n1;
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Digite um numero:");
	    n1 = teclado.nextInt();
	        if(n1%2==0){
	            System.out.println("O numero eh par");
	        }
	        else
	        {
	            System.out.println("O numero eh impar");
	        }
	}
}