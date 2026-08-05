package Aula_9.Ex10;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno("Matheus", 7.5, 8.0));
        listaAlunos.add(new Aluno("Maria", 5.0, 6.0));
        listaAlunos.add(new Aluno("Gabriel", 4.5, 5.0));
        for (Aluno aluno : listaAlunos) {
            double media = aluno.calcularMedia();
            String status = media >= 6.0 ? "aprovado" : "reprovado"; //uso de ternários
            System.out.println("Aluno: " + aluno.getNome() + ", Média: " + String.format("%.2f", media) + " - " + status);
        }
    }
}
