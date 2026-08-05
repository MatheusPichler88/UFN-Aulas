package aula16.Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        //Lendo os alunos no arquivo

        try {
            FileReader arquivo = new FileReader("aluno.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            System.out.println("Alunos lidos no arquivo");

            String linha;
            while ((linha = leitor.readLine())!=null){
                String[] campos = linha.split(",");

                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]);

                Aluno aluno = new Aluno(nome,idade);

                System.out.println("Nome: " + aluno.getNome()+"\nIdade: " + aluno.getIdade());
            }
            leitor.close();
            arquivo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
