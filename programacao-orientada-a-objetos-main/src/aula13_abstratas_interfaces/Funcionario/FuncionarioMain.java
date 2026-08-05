package aula13_abstratas_interfaces.Funcionario;

public class FuncionarioMain {
    public static void main(String[] args) {
        //Vendedor
        Funcionario vendedor = new Vendedor("João", 1600);
        vendedor.calcularSalario();

        //Gerente
        Funcionario gerente = new Gerente("Matheus", 5000);
        gerente.calcularSalario();
    }
}
