package pacote;

public class Produto {
	protected String nome;
	protected double precoBase;
	protected double percDesconto;
	protected double valorDesconto;
	public double precoFinal;

	public Produto(String nome, double precoBase, double percDesconto) {
		this.nome = nome;
		this.precoBase = precoBase;
		this.percDesconto = percDesconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public double getPercDesconto() {
		return percDesconto;
	}

	public void setPercDesconto(double percDesconto) {
		this.percDesconto = percDesconto;
	}

	public void calcularPrecoFinal() {
		precoFinal = precoBase - valorDesconto;
	}
	
	public void aplicarDesconto() {
		valorDesconto = precoBase * (percDesconto/100);
	}
}
