package Exercicio_Fixacao_2;

public class PFisica extends Contribuinte{
	
	private double despesaSaude;

	public PFisica(String nome, Double rendimentoanual, double despesaSaude) {
		super(nome, rendimentoanual);
		this.despesaSaude = despesaSaude;
	}

	public double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}

	@Override
	public Double taxa() {
		if(getRendimentoanual() < 20000) {
			return getRendimentoanual() * 0.15 - despesaSaude * 0.5;
		}
		else {
			return getRendimentoanual() * 0.25 - despesaSaude * 0.5;
		}
		
	}

}
