package aula07_exercicios;

import java.util.Scanner;

public class FilmeMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Filme a = new Filme();
		
		System.out.println("Título do filme: ");
		a.titulo = teclado.nextLine();
		System.out.println("Diretor: ");
		a.diretor = teclado.nextLine();
		System.out.println("Duração em minutos: ");
		a.duracaoEmMinutos = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Gênero: ");
		a.genero = teclado.nextLine();
		
		teclado.close();
		
		a.exibirDetalhes();
		a.ehLongo();
	}

}
