package Aula_9.Ex6;

public class Principal {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Gerente("Matheus", 8000, 2000);
        funcionarios[1] = new Desenvolvedor("Gabriel", 5000, 10);
        funcionarios[2] = new Desenvolvedor("Maria", 6000, 5);
        System.out.println("Antes do aumento:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        for (Funcionario f : funcionarios) {
            f.aumentarSalario(10);
        }
        System.out.println("\nApós o aumento:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
