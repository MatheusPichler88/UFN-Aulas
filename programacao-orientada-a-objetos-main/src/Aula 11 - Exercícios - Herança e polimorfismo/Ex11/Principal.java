package Aula_9.Ex11;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static int contarMulheres(List<Pessoa> pessoas) {
        int contador = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo() == 'F' || p.getSexo() == 'f') {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("Ana", 25, 'F'));
        listaPessoas.add(new Pessoa("Matheus", 30, 'M'));
        listaPessoas.add(new Pessoa("Maria", 22, 'f'));
        listaPessoas.add(new Pessoa("Gabriel", 40, 'M'));
        int quantidadeMulheres = contarMulheres(listaPessoas);
        System.out.println("Quantidade de mulheres: " + quantidadeMulheres);
    }
}
