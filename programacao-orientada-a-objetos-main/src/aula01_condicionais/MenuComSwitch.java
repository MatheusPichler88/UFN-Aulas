package aula01_condicionais;
import java.util.Scanner;

public class MenuComSwitch {
    public static void main(String[] args) {
	    int op, n1, n2,n3=0;
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Escolha o primeiro numero");
	    n1 = teclado.nextInt();
	    System.out.println("Escolha o segundo numero");
	    n2 = teclado.nextInt();
	    
		System.out.println("Escolha uma operacao: \n 1-(+)\n 2-(-)\n 3-(*)\n 4-(/)\n");
		op = teclado.nextInt();
		
		    switch(op){
		        case 1:
		           System.out.println("A operacao escolhida foi + ");
		           n3 = n1+n2;
		            break;
	            case 2:
	                System.out.println("A operacao escolhida foi - ");
	               n3 = n1-n2;
	                    break;
	           case 3:
	               System.out.println("A operacao escolhida foi * ");
	               n3 = n1*n2;
	                    break;
	           case 4:
	               System.out.println("A operacao escolhida foi / ");
	               n3 = n1/n2;
	                    break;
		    }
		System.out.println("Resultado: "+n3);
		    
	}
}