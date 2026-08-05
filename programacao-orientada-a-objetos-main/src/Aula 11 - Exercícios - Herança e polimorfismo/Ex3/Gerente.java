package Aula_9.Ex3;

public class Gerente extends Funcionario {
    private double bonus;
    public Gerente(double salarioBase, double bonus) {
        super(salarioBase);
        this.bonus = bonus;
    }
    @Override
    public double calcularSalario() {
        double salarioComBonus = salarioBase + bonus;
        System.out.println("Salário do gerente: " + salarioComBonus);
        return salarioComBonus;
    }
}