package Atividades_if;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int multiplo = 0;
		int divisor = 0;
		int aux = 0;
		
		System.out.println("* N�meros Multiplos *\n");
		
		System.out.print("Insira o primeiro n�mero Inteiro: ");
		multiplo = sc.nextInt();
		System.out.println("");
		
		System.out.print("Insira o segundo n�mero Inteiro: ");
		divisor = sc.nextInt();
		System.out.println("");
		
		aux = (multiplo / divisor);
		
		if(multiplo % divisor == 0) {
			System.out.println("O N�mero " + multiplo + " � multiplo de "+ aux);
		} else {
			System.out.println("O N�mero "+ multiplo + " n�o � multiplo de "+aux);
		}
		
		sc.close();
			
		
	}
	

}
