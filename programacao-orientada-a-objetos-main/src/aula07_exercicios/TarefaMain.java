package aula07_exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefaMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<Tarefa> tarefas = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
            System.out.println("Digite a descrição da tarefa " + (i + 1) + ":");
            String descricao = teclado.nextLine();

            Tarefa tarefa = new Tarefa();
            tarefa.descricao = descricao; // Atribui a descrição
            tarefas.add(tarefa); // Adiciona na lista
        }
		
		// Marca a primeira tarefa como concluída
        if (!tarefas.isEmpty()) {
            tarefas.get(0).concluirTarefa();
        }

        // Exibe todas as tarefas
        System.out.println("\n=== Lista de Tarefas ===");
        for (Tarefa t : tarefas) {
            t.exibirTarefa();
        }

        teclado.close();
	}

}
