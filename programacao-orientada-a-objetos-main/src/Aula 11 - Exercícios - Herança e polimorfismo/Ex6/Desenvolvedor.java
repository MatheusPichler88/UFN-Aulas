package Aula_9.Ex6;

public class Desenvolvedor extends Funcionario {
    private double horasExtras;
    public Desenvolvedor(String nome, double salario, double horasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
    }
    @Override
    public void aumentarSalario(double porcentagem) {
        super.aumentarSalario(porcentagem);
        salario += horasExtras * 50;
    }
    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + ", Salário: " + String.format("%.2f", salario) + ", Horas Extras: " + horasExtras;
    }
}