import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
class Util {
    public static int hash(int numero, int tamanho) {
        return numero % tamanho;
    }
}

/**
 *
 */
public class ListaHash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cria um vetor de 10 posições, cada uma será uma lista
        ArrayList<Integer>[] tabela = new ArrayList[10];

        // Inicializa cada posição do vetor com uma nova lista
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = new ArrayList<>();
        }

        // Recebe 5 números do usuário
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            // Calcula o endereço do numero dentro da tabela para o espelhamento
            int endereco = Util.hash(numero, tabela.length);
            System.out.println("Endereço gerado: " + endereco);

            // Verifica se o número já existe na lista
            if (!tabela[endereco].contains(numero)) {
                tabela[endereco].add(numero);
                System.out.println("Número inserido!");
            } else {
                System.out.println("Número já existe na tabela!");
                    tabela[endereco].remove(numero);
                    System.out.println("Testando  o numero");
            }
        }

        // Exemplo: percorrendo o vetor e imprimindo o conteúdo
        for (int i = 0; i < tabela.length; i++) {
            System.out.println("Posição " + i + ": " + tabela[i]);
        }
    }
}
