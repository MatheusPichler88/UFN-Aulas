package aula16.serializacao;

import java.io.Serializable;

public class Produtos implements Serializable {
    private String codigo;
    private String nome;
    private double preco;
    private transient String temporario;

    public Produtos(String codigo, String nome, double preco, String temporario) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.temporario = temporario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTemporario() {
        return temporario;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
    }
}
