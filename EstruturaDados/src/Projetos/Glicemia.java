package Projetos;

import java.util.ArrayList;
import java.util.Random;

public class Glicemia {
    public static void main(String[] args) {
        ArrayList<Integer> ListaGlicemia = new ArrayList<>();
        Random gerador = new Random();
        int min = 50;
        int max = 240;
        int media = 0;
        double mediana = 0;

        for (int i = 0; i < 15; i++) {
            int num = gerador.nextInt(min, max);
            if (!ListaGlicemia.contains(num)) {
                ListaGlicemia.add(num);
            }
        }
        ListaGlicemia.sort(null); // Ordena a lista em ordem crescente
        System.out.println(ListaGlicemia);

        // Média
        int soma = 0;
        for (int i = 0; i < ListaGlicemia.size(); i++) {
            soma += ListaGlicemia.get(i);
        }
        media = soma / ListaGlicemia.size();
        System.out.println("\nMédia = " + media);

        // Mediana
        int tamanho = ListaGlicemia.size();
        if (tamanho % 2 == 1) {
            mediana = ListaGlicemia.get(tamanho / 2);
        } else {
            mediana = (ListaGlicemia.get(tamanho / 2 - 1) + ListaGlicemia.get(tamanho / 2)) / 2.0;
        }
        System.out.println("\nMediana = " + mediana);

        // Moda
        int moda = ListaGlicemia.get(0);
        int maxFrequencia = 1;
        int frequenciaAtual = 1;
        boolean existeModa = false;

        for (int i = 1; i < ListaGlicemia.size(); i++) {
            if (ListaGlicemia.get(i).equals(ListaGlicemia.get(i - 1))) {
                frequenciaAtual++;
            } else {
                if (frequenciaAtual > maxFrequencia) {
                    maxFrequencia = frequenciaAtual;
                    moda = ListaGlicemia.get(i - 1);
                    existeModa = true;
                }
                frequenciaAtual = 1;
            }
        }

        // Última verificação para considerar a última sequência
        if (frequenciaAtual > maxFrequencia) {
            moda = ListaGlicemia.get(ListaGlicemia.size() - 1);
            existeModa = true;
        }

        if (existeModa && maxFrequencia > 1) {
            System.out.println("\nModa = " + moda);
        } else {
            System.out.println("\nNão há moda!");
        }
    }
}
