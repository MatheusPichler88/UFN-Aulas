package Aula_9.Ex6;

public class Funcionario {
    protected String nome;
    protected double salario;
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100);
    }
    @Override
    public String toString() {
        return "Funcionário: " + nome + ", Salário: R$ " + String.format("%.2f", salario);
    }
}