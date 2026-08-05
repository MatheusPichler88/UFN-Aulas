package aula07_exercicios;

public class Tarefa {
	String descricao;
	boolean concluida = false; //iniciaçização
	
	public void concluirTarefa() {
		concluida = true;
	}
	
	public void exibirTarefa() {
		System.out.println("Descrição: " + descricao);
        if (concluida) {
            System.out.println("Status: Concluída!");
        } else {
            System.out.println("Status: Não concluída!");
        }
	}
}
