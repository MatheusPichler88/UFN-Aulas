package Prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaEletronicos = new ArrayList<>();

        listaEletronicos.add("Notebook");
        listaEletronicos.add("Celular");
        listaEletronicos.add("Tablet");

        //Prova.Produto Eletronico
        Produto produtoEletronico = new ProdutoEletronico(listaEletronicos,12000);
        System.out.println("===Produtos Eletronicos===");
        System.out.println("Produtos: " + produtoEletronico);
        System.out.println("Preço: " + produtoEletronico.getPreco());
        produtoEletronico.aplicarDesconto(5000);
        produtoEletronico.calcularPrecoFinal();

        List<String> listaAlimenticios = new ArrayList<>();

        listaAlimenticios.add("Salgadinho");
        listaAlimenticios.add("Bolacha");
        listaAlimenticios.add("Biscoito");

        //Prova.ProdutoAlimenticio
        Produto produtoAlimenticio = new ProdutoAlimenticio(listaAlimenticios,5.00);
        System.out.println("\n===Produtos Alimenticios===");
        System.out.println("Produtos: " + produtoAlimenticio);
        System.out.println("Preço: " + produtoAlimenticio.getPreco());
        produtoAlimenticio.calcularPrecoFinal();
    }
}
