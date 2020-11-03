package Exercicio_Fixacao_2;

public abstract class Contribuinte {
	
	private String nome;
	private Double rendimentoanual;
	
	public Contribuinte(String nome, Double rendimentoanual) {
		super();
		this.nome = nome;
		this.rendimentoanual = rendimentoanual;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getRendimentoanual() {
		return rendimentoanual;
	}
	public void setRendimentoanual(Double rendimentoanual) {
		this.rendimentoanual = rendimentoanual;
	}
	
	public abstract Double taxa();

}
