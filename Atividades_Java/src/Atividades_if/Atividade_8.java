package Atividades_if;

import java.util.Scanner;

public class Atividade_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		float salario = 0;
		float imposto_1 = 0;
		float imposto_2 = 0;
		float imposto_3 =0;
		
		System.out.println("Insira o seu salario: ");
		salario = sc.nextFloat();
		System.out.println("\n");
		
		if (salario <= 2000) {
			
			System.out.println("Insencao de imposto ");
			
		} else if(salario > 2001 && salario <= 3000) {
			imposto_1 = (float) (2000 * 0.08);
			salario = salario - imposto_1;
			System.out.println("o valor descontado de impostos e de: " +salario);
			
		} else if(salario > 3001 && salario <= 4500) {
			imposto_1 = (float) (3000 * 0.18);
			imposto_2 = (float)(1000 * 0.08);
			salario = salario - (imposto_1 + imposto_2);
			System.out.println("o valor descontado de impostos e de: " +salario);
			
		}else if(salario >= 4501 ){
			imposto_1 = (float) (4500 * 0.28);
			imposto_2 = (float) (1500 * 0.18);
			imposto_3 = (float) (1000 * 0.08);
			salario = salario - (imposto_1 + imposto_2 + imposto_3);
			System.out.println("o valor descontado de impostos e de: " +salario);
		}
		
		sc.close();
	}

}
