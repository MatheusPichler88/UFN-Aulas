package Prova;

import java.util.List;

public class Produto {
private String nome;
List listaEletronico;
private double preco;
private double desconto;

    public Produto(List listaEletronico, double preco) {
        this.listaEletronico = listaEletronico;
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public void aplicarDesconto(double desconto){
    }
    public void calcularPrecoFinal(){
    }
    @Override
    public String toString() {
        return
                "" + listaEletronico;
    }
}
