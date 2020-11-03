package Programacao_Enumeracao;

public class ItemPedido {
	
	private int quantidade;
	private Double preco;
	
	private Produto produto;

	public ItemPedido(int quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	public Double subTotal() {
		return preco * quantidade;
	}

	@Override
	public String toString() {
		return "Produto: " + produto.getNome() +
				"Produto Preco: "+ preco + ", "+
				"Quantidade: " + quantidade + "," 
				+ "Subtotal: " + String.format("%.2f", subTotal());
	}
	
	
	
	

}
