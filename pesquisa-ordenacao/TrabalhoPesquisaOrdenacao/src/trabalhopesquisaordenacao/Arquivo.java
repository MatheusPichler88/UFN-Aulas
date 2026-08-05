package trabalhopesquisaordenacao;

import java.io.*;
import java.util.*;

public class Arquivo {
    private String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public int[] lerNumeros() {
        ArrayList<Integer> lista = new ArrayList<>();

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            
            while ((linha = leitor.readLine()) != null) {
                lista.add(Integer.parseInt(linha.trim()));
            }
            leitor.close();
            
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        // Converter ArrayList para array normal
        int[] vetor = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            vetor[i] = lista.get(i);
        }

        return vetor;
    }

    public void gerarNumerosAleatorios(int quantidade, int maximo) {
        try {
            PrintWriter gravador = new PrintWriter(new FileWriter(nomeArquivo));
            Random random = new Random();
            
            for (int i = 0; i < quantidade; i++) {
                int numero = random.nextInt(maximo) + 1;
                gravador.println(numero);
            }
            
            gravador.close();
            
        } catch (Exception e) {
            System.out.println("Erro ao gerar números: " + e.getMessage());
        }
    }
}