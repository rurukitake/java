package Atividades_while;

import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num_1 = 0;
		int fatorial = 1;
		
		System.out.println("*** FATORIAL ***");
		System.out.println("");
		
		System.out.print("Insira um número que vosê deseja saber o seu fatorial: ");
		num_1 = sc.nextInt();
		
	    for (int i = 2; i <= num_1; i++) {
	    	System.out.println(i);
	        fatorial = fatorial * i;
	    }
	    
		System.out.println("");
		System.out.println("O " + num_1 + "! é " + fatorial);
		
		sc.close();
	}

}
