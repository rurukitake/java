package Classes;

public class Funcionario {
	
	public String nome;
	public double salario_bruto;
	public double imposto;
	
	public double salario_liquido() {
		return salario_bruto * imposto;
	}
	
	public void acrescimo_salario(double porcentagem) {
		salario_bruto += salario_bruto * porcentagem / 100.0;
	}
	
	public String toString(){
		 return nome + ", R$ " + String.format("%.2f", salario_liquido());
	}
}
