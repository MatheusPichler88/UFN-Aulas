package Aula_9.Ex6;

public class Gerente extends Funcionario {
    private double bonusAnual;
    public Gerente(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }
    @Override
    public void aumentarSalario(double porcentagem) {
        super.aumentarSalario(porcentagem);
        salario += bonusAnual;
    }
    @Override
    public String toString() {
        return "Gerente: " + nome + ", Salário: R$ " + String.format("%.2f", salario) + ", Bônus Anual: R$ " + String.format("%.2f", bonusAnual);
    }
}