package Aula_9.Ex3;

public class Principal {
    public static void main(String[] args) {
        Funcionario f = new Funcionario(3000);
        System.out.println("Salário do funcionário: " + f.calcularSalario());
        Gerente g = new Gerente(5000, 1500);
        g.calcularSalario();
    }
}
