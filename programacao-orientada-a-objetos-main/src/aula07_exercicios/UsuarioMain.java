package aula07_exercicios;

import java.util.Scanner;

public class UsuarioMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Usuario a = new Usuario();
		
		a.nomeUsuario = "Drih";
		a.senha = "202302";
		
		System.out.println("*Login*");
		System.out.println("Usuário: ");
		String usuario = teclado.nextLine();
		System.out.println("Senha: ");
		String senha = teclado.nextLine();
		
		a.login(usuario, senha);
		a.exibirStatus();
		
		System.out.println("Fazer deseja fazer logout?\n1 - Sim\nOutra tecla - Encerra");
		String opcao = teclado.nextLine();
		if(opcao.equals("1")) {
			a.logout();
			a.exibirStatus();
		}
	}
		
		

}
