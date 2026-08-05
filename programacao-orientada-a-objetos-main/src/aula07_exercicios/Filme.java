package aula07_exercicios;

public class Filme {
	String titulo;
	String diretor;
	int duracaoEmMinutos;
	String genero;
	
	public void exibirDetalhes() {
		System.out.println("\n*Informações do filme*");
		System.out.println("Título: " + titulo);
		System.out.println("Diretor: " + diretor);
		System.out.println("Duração (em minutos): " + duracaoEmMinutos);
		System.out.println("Gênero: " + genero);
	}
	
	public boolean ehLongo() {
		if(duracaoEmMinutos >= 120) {
			System.out.println("Filme longo");
			
			return true;
		}
		else {
			System.out.println("Filme curto");
			
			return false;
		}
			
	}
}
