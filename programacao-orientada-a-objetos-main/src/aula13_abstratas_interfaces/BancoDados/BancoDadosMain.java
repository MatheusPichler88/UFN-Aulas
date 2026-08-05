package aula13_abstratas_interfaces.BancoDados;

public class BancoDadosMain {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();

        bancoDeDados.conectar();
        bancoDeDados.inserir();
        bancoDeDados.atualizar();
        bancoDeDados.excluir();
        bancoDeDados.desconectar();
    }
}
