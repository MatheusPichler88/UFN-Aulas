package aula13_abstratas_interfaces.Pessoa;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String cidade, String cpf) {
        super(nome, cidade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void efetuarCompra() {
        System.out.println("=== Compra Realizada ===");
        System.out.println("Compra efetuada por pessoa fisíca:");
        System.out.println("Nome: " + getNome());
        System.out.println("Cidade: " + getCidade());
        System.out.println("CPF: " + getCpf());

    }
}
