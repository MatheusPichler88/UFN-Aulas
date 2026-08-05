package aula13_abstratas_interfaces.Funcionario;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularSalario() {
        double bonus = 2300;
        double salarioFinal = getSalario() + bonus;
        System.out.println("Gerente: " +getNome());
        System.out.println("Foi atribuido um bônus ao salário\nSalário Final: "+salarioFinal);
    }
}
