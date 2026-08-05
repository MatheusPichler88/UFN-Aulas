package Aula_9.Ex9;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Camiseta", 39.90, 10));
        listaProdutos.add(new Produto("Calça", 120.0, 5));
        listaProdutos.add(new Produto("Tênis", 250.50, 3));
        for (Produto p : listaProdutos) {
            System.out.println(p);
        }
    }
}
