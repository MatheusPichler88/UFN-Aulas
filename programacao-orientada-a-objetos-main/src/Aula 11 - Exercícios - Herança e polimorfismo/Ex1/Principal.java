package Aula_9.Ex1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Instanciando o objeto Notebook
        Notebook not = new Notebook("Portatil");
        System.out.println("Insira a marca do Notebook:");
        not.setMarca(sc.nextLine());

        //Instanciando o objeto Netbook
        Netbook net = new Netbook("Portatil");
        System.out.println("Insira a marca do Netbook:");
        net.setMarca(sc.nextLine());

        //Saida de dados:

        System.out.println("Notebook:");
        System.out.println("Marca: "+not.exibeMarca()+"\nModelo: "+not.exibeModelo());
        System.out.println("Netbook:");
        System.out.println("Marca: "+net.exibeMarca()+"\nModelo: "+net.exibeModelo());

    }
}
