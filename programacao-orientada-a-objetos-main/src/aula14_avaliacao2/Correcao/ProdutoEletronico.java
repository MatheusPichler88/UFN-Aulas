package pacote;

public class ProdutoEletronico extends Produto{
	public boolean gExtendida;

	public ProdutoEletronico(String nome, double precoBase, double percDesconto, boolean gExtendida) {
		super(nome, precoBase, percDesconto);
		this.gExtendida = gExtendida;
	}
	public void aplicarDesconto(boolean valorFixo) {
		if (valorFixo) {
			valorDesconto = precoBase - 15;
		}
		else {
			valorDesconto = precoBase * (percDesconto/100);			
		}
	}
	@Override
	public void calcularPrecoFinal() {
		if (gExtendida) {
			precoFinal = precoBase - valorDesconto;
			precoFinal = precoFinal * 1.2;
		}
		else {
			precoFinal = precoBase - valorDesconto;
		}
	}	
}
