package Atividades_if;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			
			System.out.println("o numero " +numero+ " e par");
			
		} else {
			
			System.out.println("o numero " +numero+ " e impar");
		}
		
		sc.close();
	}

}
