package Atividades_if;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int num_1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero");
		int num_2 = sc.nextInt();
		
		if(num_1 % num_2 == 0) {
			
			System.out.println("o numero " +num_1+ " e multiplo do numero " +num_2 );
		} else{
			
			System.out.println("o numero nao e multiplo");
		}
			
		
	}
	

}
