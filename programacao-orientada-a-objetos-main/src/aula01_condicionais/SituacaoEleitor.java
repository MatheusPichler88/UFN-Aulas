package aula01_condicionais;
import java.util.Scanner;

public class SituacaoEleitor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade = teclado.nextInt();

        if (idade < 16) {
            System.out.println("Nao esta apto para votar");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("O voto eh facultativo");
        } else {
            System.out.println("O voto eh obrigatorio");
        }

    }
}