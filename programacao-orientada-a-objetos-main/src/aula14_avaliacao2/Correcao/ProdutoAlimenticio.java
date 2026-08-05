package pacote;

public class ProdutoAlimenticio extends Produto{
	public boolean proximoVencimento;
	
	public ProdutoAlimenticio(String nome, double precoBase, double percDesconto, boolean proximoVencimento) {
		super(nome, precoBase, percDesconto);
		this.proximoVencimento = proximoVencimento;
	}

	@Override
	public void calcularPrecoFinal() {
		if(proximoVencimento) {
			precoFinal = precoBase - valorDesconto;
			precoFinal = precoFinal - (precoFinal * 0.25);
		}
		else {
			precoFinal = precoBase - valorDesconto;
		}
	}
	
}
