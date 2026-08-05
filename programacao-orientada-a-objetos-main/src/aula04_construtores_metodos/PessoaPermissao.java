package aula04_construtores_metodos;

public class PessoaPermissao {
    String nome;
    String email;
    String dataNasc;
    String endereco;
    boolean admin;

    PessoaPermissao(String nome, String email, String dataNasc, String endereco) {
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.admin = false;
    }

    void promoverAdmin() {
        this.admin = true;
    }
}
