package aula15.pkg;

public class Pessoa {
    private String nome;
     private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void validaIdade() throws MinhaExcecao {
        if(idade <0 || idade > 120) {
            throw new MinhaExcecao("Idade invalida, tente novamente!");
        }
        else {
            System.out.println("Idade validada com sucesso!");
        }
    }
}
