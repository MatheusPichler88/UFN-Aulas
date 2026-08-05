//4 - Crie uma classe Conta com os atributos titular e saldo.
// Crie um método depositar(Conta c, double valor) que receba a conta como parâmetro e aumente o saldo.
package aula12_relacionamento_listas;

public class MainGerenciadorConta {
    public static void main(String[] args) {
        GerenciadorConta conta1 = new GerenciadorConta("Matheus", 3000);
        GerenciadorConta conta2 = new GerenciadorConta("Maria", 7200);

        conta1.mostrarDados();
        conta2.mostrarDados();

        conta1.depositar(conta2, 837);
        conta1.mostrarDados();
        conta2.mostrarDados();
    }
}
