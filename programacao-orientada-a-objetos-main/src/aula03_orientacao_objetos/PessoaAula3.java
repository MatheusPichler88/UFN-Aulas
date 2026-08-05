package aula03_orientacao_objetos;

import java.util.Scanner;

public class PessoaAula3 {
	public String nome;
	public int idade;
	public String genero;
	
	public static void main(String[] args) {
		PessoaAula3 p = new PessoaAula3();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		p.nome = sc.nextLine();
		System.out.println("Idade: ");
		p.idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Genero: ");
		p.genero = sc.nextLine();
		
		System.out.println("\nNome:"+p.nome);
		System.out.println("Idade:"+p.idade);
		System.out.println("Genero:"+p.genero);
	}
	
}
