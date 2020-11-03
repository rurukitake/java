package Exercicio_Fixacao_2;

public class PJuridica extends Contribuinte{
	
	private Integer numerofuncionarios;

	public PJuridica(String nome, Double rendimentoanual, Integer numerofuncionarios) {
		super(nome, rendimentoanual);
		this.numerofuncionarios = numerofuncionarios;
	}
	
	public Integer getNumerofuncionarios() {
		return numerofuncionarios;
	}
	public void setNumerofuncionarios(Integer numerofuncionarios) {
		this.numerofuncionarios = numerofuncionarios;
	}

	@Override
	public Double taxa() {
		if(numerofuncionarios > 10) {
			return getRendimentoanual() * 0.14;
		}
		else {
			return getRendimentoanual() * 0.16;
		}
	}

}
