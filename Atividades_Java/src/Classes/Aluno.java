package Classes;

public class Aluno {

	public String nome;
	public double nota_1;
	public double nota_2;
	public double nota_3;
	
	public double nota_final() {
		return nota_1 + nota_2 + nota_3;
	}
	
	
	public double faltar_pontos() {
		if (nota_final() < 60.0) {
			return 60.0 - nota_final();
		} else{
			return 0.0;
		}
	}
	
	
}
