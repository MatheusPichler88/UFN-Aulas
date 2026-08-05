package aula12_relacionamento_listas;

//1 - Crie uma classe Aluno com os atributos nome e notaFinal.
//2 - Em seguida, crie uma classe Boletim com um método imprimirStatus(Aluno a) que imprime se o aluno foi aprovado (nota >= 6) ou reprovado.
public class MainStatusAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno("Matheus", 8.0);
        Boletim b = new Boletim();

        System.out.println("Nome: "+a.getNome());
        System.out.println("Nota: "+a.getNotaFinal());
        b.imprimirStatus(a);
    }
}
