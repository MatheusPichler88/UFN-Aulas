package aula04_construtores_metodos;

public class AlunoConstrutor {
    String nome;
    String matricula;
    String dataNasc;
    int anoIngresso;

    AlunoConstrutor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        System.out.println("Nome: " + this.nome + ", Matrícula: " + this.matricula);
    }

    AlunoConstrutor(String dataNasc) {
        this.dataNasc = dataNasc;
        System.out.println("Data de Nascimento: " + this.dataNasc);
    }

    AlunoConstrutor(String nome, String dataNasc, int anoIngresso) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.anoIngresso = anoIngresso;
        System.out.println("Nome: " + this.nome + ", Data de Nascimento: " + this.dataNasc + ", Ano de Ingresso: " + this.anoIngresso);
    }
}
