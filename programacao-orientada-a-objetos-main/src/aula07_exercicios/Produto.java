package aula07_exercicios;

public class Produto {
	String nome;
	double preco;
	int quantidade;
	
	public void exibirInformacoes() {
		System.out.println("\n*Informações do produto:*");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: R$" + preco);
		System.out.println("Quantidade: " + quantidade);
	}
	
	public double calcularValorTotal() {
		double total = preco*quantidade;
		System.out.println("Valor total: R$" + total);
		
		return total;
	}
}
