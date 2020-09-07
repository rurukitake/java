package Atividades_while;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		boolean status = true;
		
		System.out.println("*** Intervalos ***");
		System.out.println("");
		
		while(status == true) {
		
			System.out.print("Insira um número positivo inteiro: ");
			numero = sc.nextInt();
			System.out.println("");
			
			if(numero >= 0) {
			
				System.out.println("Os números inteiros ímpares de 0 á "+numero+" são: \n");
				
				for(int i = 0; i <= numero; i++) {
					if(i % 2 == 1) {
						System.out.println(i);
					}
				}
				
				status = false;
			} else {
				System.out.println("*** O número deve ser positivo ! ***\n");
			}
		}
		sc.close();
	}

}
