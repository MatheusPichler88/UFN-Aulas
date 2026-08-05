package aula13_abstratas_interfaces.Pessoa;

public class PessoaMain {
    public static void main(String[] args) {
        //Pessoa Física
        Pessoa pessoaFisica = new PessoaFisica("Matheus", "Santa Maria", "123.456.789-00");
        pessoaFisica.efetuarCompra();

        //Pessoa Jurídica
        Pessoa pessoaJuridica = new PessoaJuridica("NewTech", "Santa Maria","12.345.678/0001-90");
        pessoaJuridica.efetuarCompra();
    }
}
