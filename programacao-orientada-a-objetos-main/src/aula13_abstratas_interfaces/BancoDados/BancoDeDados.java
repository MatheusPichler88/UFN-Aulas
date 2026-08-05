package aula13_abstratas_interfaces.BancoDados;

public class BancoDeDados implements AcessoDados {
    @Override
    public void conectar() {
        System.out.println("Conectando ao banco de dados...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do banco de dados...");
    }

    @Override
    public void inserir() {
        System.out.println("Inserindo dados no banco de daods...");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando dados no banco de dados...");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo dados do banco de dados...");
    }
}
