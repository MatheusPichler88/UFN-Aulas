package aula15.pkg;

public class PessoaPrincipal {
    public static void main(String[] args) throws MinhaExcecao {
        Pessoa p = new Pessoa("Matheus Dias", 200);

        try {
            p.validaIdade();
        } catch (MinhaExcecao e) {
            System.out.println(e.getMessage());
        }
    }
}
