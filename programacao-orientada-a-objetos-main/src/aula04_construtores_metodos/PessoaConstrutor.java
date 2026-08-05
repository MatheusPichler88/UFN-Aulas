package aula04_construtores_metodos;

public class PessoaConstrutor {
    String nome;
    int idade;

    PessoaConstrutor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade);
    }

    PessoaConstrutor(int idade) {
        this.idade = idade;
        System.out.println("Idade: " + this.idade);
    }
}
