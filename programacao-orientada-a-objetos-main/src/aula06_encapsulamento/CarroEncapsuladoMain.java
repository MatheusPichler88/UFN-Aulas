package aula06_encapsulamento;

import java.util.Scanner;

public class CarroEncapsuladoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarroEncapsulado carro = new CarroEncapsulado();  // corrigido aqui

        System.out.print("Digite a marca do carro: ");
        String marca = sc.nextLine();
        carro.setMarca(marca);

        System.out.print("Digite o modelo do carro: ");
        String modelo = sc.nextLine();
        carro.setModelo(modelo);

        System.out.print("Digite o ano do carro: ");
        int ano = sc.nextInt();
        carro.setAno(ano);

        System.out.println("\nDetalhes do carro:");
        carro.exibir();

        sc.close();
    }
}
