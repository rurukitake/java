package Atividades_if;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		if(numero < 0) {
			
			System.out.println("numero negativo");
			
		} else if(numero > 0 ) {
			
			System.out.println("numero positivo");
		}
		

	}

}
