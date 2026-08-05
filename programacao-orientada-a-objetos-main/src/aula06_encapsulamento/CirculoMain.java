package aula06_encapsulamento;

import java.util.Scanner;

public class CirculoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Digite o raio do círculo: ");
        double Raio = sc.nextDouble();
        circulo.setRaio(Raio);

        double area = circulo.calculaArea();
        System.out.println("Área do círculo: " + area);

        sc.close();
    }
}
