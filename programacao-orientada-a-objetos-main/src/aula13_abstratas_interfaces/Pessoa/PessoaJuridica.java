package aula13_abstratas_interfaces.Pessoa;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String cidade, String cnpj) {
        super(nome, cidade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void efetuarCompra() {
        System.out.println("=== Compra Realizada ===");
        System.out.println("Compra efetuada por pessoa jurídica:");
        System.out.println("Nome: " + getNome());
        System.out.println("Cidade: " + getCidade());
        System.out.println("CNPJ: " + getCnpj());

    }
}
