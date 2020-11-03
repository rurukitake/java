package Exercicio_Fixacao_1;

public class ProdutoImportado extends Produto{

	private Double Taxaalfandega;

	public ProdutoImportado(String nome, Double preco, Double taxaalfandega) {
		super(nome, preco);
		Taxaalfandega = taxaalfandega;
	}
	
	public Double getTaxaalfandega() {
		return Taxaalfandega;
	}
	public void setTaxaalfandega(Double taxaalfandega) {
		Taxaalfandega = taxaalfandega;
	}

	public Double totalPreco() {
		return getPreco() + Taxaalfandega;
	}

	@Override
	public String etiquetaPreco() {
		return getNome() + " R$ " + String.format("%.2f", totalPreco()) + " (Taxa alfandega: R$ )" +  String.format("%.2f", Taxaalfandega);
	}
}
