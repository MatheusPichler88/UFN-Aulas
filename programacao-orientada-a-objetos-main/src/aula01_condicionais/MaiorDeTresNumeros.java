package aula01_condicionais;
import java.util.Scanner;

public class MaiorDeTresNumeros {
    public static void main(String[] args) {
	    int n1, n2, n3;
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Digite o primeiro numero:");
	    n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero:");
	    n2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero:");
	    n3 = teclado.nextInt();
			
			if(n1>n2 && n1>n3){
				System.out.println("O maior numero digitado eh:"+n1);
	       
	}
	
			else if(n2>n1 && n2>n3){
				System.out.println("O maior numero digitado eh:"+n2);
	}
	
			else if(n3>n2 && n3>n1){
				System.out.println("O maior numero digitado eh:"+n3);
	
	}
	       else {
	            System.out.println("nenhum");
	       }
}
}



