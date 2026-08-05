package aula13_abstratas_interfaces.BancoDados;

public interface AcessoDados {
    void conectar();
    void desconectar();
    void inserir();
    void atualizar();
    void excluir();

}
