package Exemplos_aula;

import java.util.Locale;
import java.util.Scanner;

import Classes.Funcionario;

public class Programa_funcao {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Nome:  ");
		func.nome = obj.nextLine();
		
		System.out.println("Informe salario bruto:  ");
		func.salario_bruto = obj.nextDouble();
		
		System.out.println("Informe o imposto:  ");
		func.imposto = obj.nextDouble();
		
		System.out.println("Funcionario: " + func);
		
		System.out.println("Informe o percentual de incremento: ");
		double percentual = obj.nextDouble();
		
		func.acrescimo_salario(percentual);
		
		System.out.println("Dados atualizados: " +func);
		obj.close();
		
	}

}
