package aula07_exercicios;

public class Usuario {
	String nomeUsuario;
	String senha;
	boolean logado = false; //inicializar
	
	public void login(String usuario, String senha) {
		if(usuario.equals(this.nomeUsuario) && senha.equals(this.senha)) {
			logado = true;
		}
	}
	
	public void logout() {
		logado = false;
	}
	
	public void exibirStatus() {
		if(logado == true)
			System.out.println("Usuário logado!");
		else
			System.out.println("Usuário deslogado");
	}
}
