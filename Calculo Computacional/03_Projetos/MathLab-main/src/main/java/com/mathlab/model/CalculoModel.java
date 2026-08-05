package com.mathlab.model;

public class CalculoModel {

    private int tamanho = 3;
    private Double[][] matrizA = new Double[10][10];
    private Double[] vetorB = new Double[10];
    private String metodo = "gauss";
    private double tolerancia = 0.0001;
    private int maxIteracoes = 100;
    private int iteracoesRealizadas;
    private boolean convergiu = true;
    private String aviso;

    public CalculoModel() {}

    public int getTamanho() { return tamanho; }
    public void setTamanho(int tamanho) { this.tamanho = tamanho; }

    public Double[][] getMatrizA() { return matrizA; }
    public void setMatrizA(Double[][] matrizA) { this.matrizA = matrizA; }

    public Double[] getVetorB() { return vetorB; }
    public void setVetorB(Double[] vetorB) { this.vetorB = vetorB; }

    public String getMetodo() { return metodo; }
    public void setMetodo(String metodo) { this.metodo = metodo; }

    public double getTolerancia() { return tolerancia; }
    public void setTolerancia(double tolerancia) { this.tolerancia = tolerancia; }

    public int getMaxIteracoes() { return maxIteracoes; }
    public void setMaxIteracoes(int maxIteracoes) { this.maxIteracoes = maxIteracoes; }

    public int getIteracoesRealizadas() { return iteracoesRealizadas; }
    public void setIteracoesRealizadas(int iteracoesRealizadas) { this.iteracoesRealizadas = iteracoesRealizadas; }

    public boolean isConvergiu() { return convergiu; }
    public void setConvergiu(boolean convergiu) { this.convergiu = convergiu; }

    public String getAviso() { return aviso; }
    public void setAviso(String aviso) { this.aviso = aviso; }
}