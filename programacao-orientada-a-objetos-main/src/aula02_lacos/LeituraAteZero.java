package aula02_lacos;
import java.util.Scanner;
public class LeituraAteZero {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	int i=0;
	
	for(;;) {
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
			if(n==0) {
				break;
	}
	 
	}
	System.out.println("Programa finalizado.");
    sc.close();
}
}