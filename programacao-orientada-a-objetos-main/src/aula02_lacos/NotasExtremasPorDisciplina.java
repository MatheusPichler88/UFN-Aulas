package aula02_lacos;
import java.util.Scanner;

public class NotasExtremasPorDisciplina {
    public static void main(String[] args) {
        int[][] notas = new int[3][4];
        int[] soma = new int[3];
        double[] media = new double[3];
        int maior = 0;
        int menor = 999999999;
        int alunoMaior = 0;
        int alunoMenor = 0;
        String[] alunos = new String[3];
        Scanner teclado = new Scanner(System.in);


        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite o nome do aluno " + (i+1) + ": ");
            alunos[i] = teclado.nextLine();
            for(int j = 0; j < notas[i].length; j++){
                System.out.println("Digite a nota " + (j+1) + " do aluno " + alunos[i] + ": ");
                notas[i][j] = teclado.nextInt();
                soma[i] += notas[i][j];
            }
            teclado.nextLine();
            media[i] = (double) soma[i] / notas[i].length;
            if(media[i] > maior){
                maior = (int) media[i];
                alunoMaior = i;
            }
            if(media[i] < menor){
                menor = (int) media[i];
                alunoMenor = i;
            }
        }

        teclado.close();


        for(int i = 0; i < notas.length; i++){
            System.out.println("Média do aluno " + alunos[i] + ": " + media[i]);
        }
        System.out.println("\nMaior média: " + alunos[alunoMaior] + " com " + maior + " pontos.");
        System.out.println("\nMenor média: " + alunos[alunoMenor] + " com " + menor + " pontos.");
    }
}