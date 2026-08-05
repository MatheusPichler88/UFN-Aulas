package aula16.Arquivos;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Matheus", 22);
    Aluno aluno2 = new Aluno("Gabriel", 35);
    Aluno aluno3 = new Aluno("Andriza", 17);

    //Escrevendo os alunos em um arquivo texto

        try{
            FileWriter arquivo = new FileWriter("aluno.txt", true);
            BufferedWriter escritor = new BufferedWriter(arquivo);

    //Escrevendo alunos no arquivo
            escritor.write(aluno1.getNome()+","+ aluno1.getIdade());
            escritor.newLine();

            escritor.write(aluno2.getNome()+","+ aluno2.getIdade());
            escritor.newLine();

            escritor.write(aluno3.getNome()+","+ aluno3.getIdade());
            escritor.newLine();

            escritor.close();
            arquivo.close();

            System.out.println("Alunos salvos no arquivo.txt");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
