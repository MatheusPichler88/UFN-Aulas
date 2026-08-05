//Crie uma classe aula03_orientacao_objetos.Livro com os atributos titulo e autor.
// Em seguida, crie uma lista de livros (ArrayList) e um método que recebe a lista e imprime os dados de cada livro.
package aula12_relacionamento_listas;

import java.util.ArrayList;
import java.util.List;

public class MainListaLivros {
    public static void main(String[] args) {
        List<Livro> listaLivro = new ArrayList<>();

        listaLivro.add(new Livro("Dom Casmurro", "Machado de Assis"));
        listaLivro.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"));
        listaLivro.add(new Livro("Dom Quixote", "Miguel de Cervantes"));
        listaLivro.add(new Livro("1984", "George Orwell"));
        listaLivro.add(new Livro("O Senhor dos Anéis", " J.R.R. Tolkien"));

        for (Livro livros : listaLivro) {
            System.out.println("Título: " + livros.getTitulo());
            System.out.println("Autor: " + livros.getAutor());
            System.out.println("------------------------------");
        }


    }
}
