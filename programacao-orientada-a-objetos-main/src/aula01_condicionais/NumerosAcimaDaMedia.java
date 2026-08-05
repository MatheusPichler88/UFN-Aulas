package aula01_condicionais;
import java.util.Scanner;

public class NumerosAcimaDaMedia {
    public static void main(String[] args) {
	    int n1, n2, n3, n4, media;
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Digite o primeiro numero:");
	    n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero:");
	    n2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero:");
	    n3 = teclado.nextInt();
        System.out.println("Digite o quarto numero:");
	    n4 = teclado.nextInt();
	    
	    media = (n1+n2+n3+n4)/4;
            if(n1>media){
            System.out.println("Superior a media: "+n1);
            }
            else if (n2>media){
            System.out.println("Superior a media: "+n2);    
            }
            else if (n3>media){
            System.out.println("Superior a media: "+n3);    
            }
            else if (n4>media){
            System.out.println("Superior a media: "+n4);    
            }
            else{
            System.out.println("Nenhum numero eh superior a media");  
            }
	       
	}
}
