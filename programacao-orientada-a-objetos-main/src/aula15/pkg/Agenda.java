package aula15.pkg;

public class Agenda {
    private String nome;
    private String telefone;

    public Agenda(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void adicionarContato() throws Exception{
        if(nome == null && telefone == null){
        throw new IllegalArgumentException("Os valores nao foram preenchidos");
        }
        else{
            System.out.println("Os valores foram preenchidos");
        }
    }
}
