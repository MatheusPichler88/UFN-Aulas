package aula03_orientacao_objetos;

import java.util.Scanner;

public class LivroAula3 {
	public String titulo;
	public String autor;
	public int ano_pub;
	
	public static void main(String[] args) {
		LivroAula3 l = new LivroAula3();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Titulo: ");
		l.titulo = sc.nextLine();
		System.out.println("Autor: ");
		l.autor = sc.nextLine();
		System.out.println("Ano de Publicação: ");
		l.ano_pub = sc.nextInt();
		
		System.out.println("\nTitulo:"+l.titulo);
		System.out.println("Autor:"+l.autor);
		System.out.println("Ano de Publicação:"+l.ano_pub);

	}

}
