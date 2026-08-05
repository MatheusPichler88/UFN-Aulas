package Aula_9.Ex3;

public class Funcionario {
    protected double salarioBase;
    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double calcularSalario() {
        return salarioBase;
    }
}