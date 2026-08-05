package aula16.Desafio;

import aula16.Arquivos.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //Criando objetos Aluno

        Aluno aluno1 = new Aluno("Matheus", 22);
        Aluno aluno2 = new Aluno("Gabriel", 30);
        Aluno aluno3 = new Aluno("Andriza", 18);

        List<Aluno> alunos = new ArrayList<Aluno>();
        Arquivo arquivo = new Arquivo("Alunos");
        arquivo.gravarArquivo(aluno1);
        arquivo.gravarArquivo(aluno2);
        arquivo.gravarArquivo(aluno3);

        List<Aluno> lista = arquivo.lerArquivo();

        for(Aluno a : lista){
            System.out.println("Nome: " + a.getNome()+", idade: " + a.getIdade());
        }
    }
}
