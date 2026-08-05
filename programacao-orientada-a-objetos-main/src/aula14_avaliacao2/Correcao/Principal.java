package pacote;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList();
		ProdutoEletronico pe1 = new ProdutoEletronico("PC", 1000, 0, true);
		produtos.add(pe1);
		ProdutoEletronico pe2 = new ProdutoEletronico("JBL", 700, 12, false);
		produtos.add(pe2);
		ProdutoEletronico pe3 = new ProdutoEletronico("Projetor", 2000, 0, true);
		produtos.add(pe3);
		
		ProdutoAlimenticio pa1 = new ProdutoAlimenticio("Banana", 10, 3, true);
		produtos.add(pa1);
		ProdutoAlimenticio pa2 = new ProdutoAlimenticio("Leite", 8, 0, false);
		produtos.add(pa2);
		ProdutoAlimenticio pa3 = new ProdutoAlimenticio("Carne", 100, 10, true);
		produtos.add(pa3);
		
		for(Produto p : produtos) {
			p.aplicarDesconto();
			p.calcularPrecoFinal();
			System.out.println("Produto: "+p.nome);
			System.out.println("Preço base: "+p.precoBase);
			System.out.println("Desconto: "+p.percDesconto);
			System.out.println("Valor desconto: "+p.valorDesconto);
			System.out.println("Preço final: "+p.precoFinal);
			System.out.println("------------------------------------");
		}

	}

}
