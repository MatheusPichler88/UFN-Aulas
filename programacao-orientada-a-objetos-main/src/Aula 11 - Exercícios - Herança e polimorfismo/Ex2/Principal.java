package Aula_9.Ex2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto Fruta:");
        double valorFruta = sc.nextDouble();

        Produto p = new Produto("Fruta", valorFruta);
        ProdutoComDesconto p2 = new ProdutoComDesconto("Fruta", valorFruta);

        p.desconto();
        p2.desconto();

        sc.close();
    }
}
