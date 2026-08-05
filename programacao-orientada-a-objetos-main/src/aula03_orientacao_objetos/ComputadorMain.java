package aula03_orientacao_objetos;

import java.util.Scanner;

public class ComputadorMain {

	public static void main(String[] args) {
	
		Computador c = new Computador();
		Computador c2 = new Computador();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("aula03_orientacao_objetos.Computador 1:");
		System.out.println("Marca: ");
		c.marca = sc.nextLine();
		System.out.println("Modelo: ");
		c.modelo = sc.nextLine();
		System.out.println("Tipo: ");
		c.tipo = sc.nextLine();
		System.out.println("Preço: ");
		c.preco = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("\naula03_orientacao_objetos.Computador 1:");
		System.out.println("Marca: "+c.marca);
		System.out.println("Modelo: "+c.modelo);
		System.out.println("Tipo: "+c.tipo);
		System.out.println("Preço: "+c.preco);
		
		c2.marca = "Samsung";
		c2.modelo = "S6-Lite";
		c2.tipo = "Tablet";
		c2.preco = 2000;
		
		System.out.println("\naula03_orientacao_objetos.Computador 2:");
		System.out.println("Marca: "+c2.marca);
		System.out.println("Modelo: "+c2.modelo);
		System.out.println("Tipo: "+c2.tipo);
		System.out.println("Preço: "+c2.preco);
	}

}
