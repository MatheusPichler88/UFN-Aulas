package aula02_lacos;
import java.util.Scanner;

public class CidadesAteSaoPaulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(;;) {
            System.out.println("Digite a cidade: ");
            String nome = sc.nextLine();
            
            if(nome.equals("São Paulo") ) {
                break;
            }
            
            System.out.println("Cidade registrada: "+nome);
        }

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
