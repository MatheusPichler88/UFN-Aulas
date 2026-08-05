package aula13_abstratas_interfaces.Funcionario;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularSalario() {
        double comissao = getSalario() * 0.10;
        double salarioFinal = getSalario()+ comissao;
        System.out.println("Vendedor: "+getNome());
        System.out.println("Foi atribuído uma comissão no salário \nSalário Final: "+salarioFinal);
    }
}
