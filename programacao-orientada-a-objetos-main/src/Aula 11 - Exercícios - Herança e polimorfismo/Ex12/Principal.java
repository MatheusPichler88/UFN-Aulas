package Aula_9.Ex12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Livro> listaLivros = new ArrayList<>();

        // Adicionando livros
        listaLivros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        listaLivros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        listaLivros.add(new Livro("1984", "George Orwell", 1949));
        listaLivros.add(new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967));

        // Ordenando pelo ano de lançamento
        listaLivros.sort(Comparator.comparingInt(Livro::getAno));

        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }
    }
}

