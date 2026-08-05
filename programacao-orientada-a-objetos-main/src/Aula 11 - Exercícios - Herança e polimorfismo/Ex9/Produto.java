package Aula_9.Ex9;

import java.util.ArrayList;
import java.util.List;
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$ " + String.format("%.2f", preco) + ", Quantidade: " + quantidade;
    }
}