package aula04_construtores_metodos;

class LivroEmprestimo {
    String titulo;
    String autor;
    int anoPublicacao;
    String genero;
    boolean emprestado;

    public LivroEmprestimo(String titulo, String autor, int anoPublicacao, String genero) {
        titulo = titulo;
        autor = autor;
        anoPublicacao = anoPublicacao;
        genero = genero;
        emprestado = false;
    }
}
