package Atividades_if;

import java.util.Scanner;

public class Atividade_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int eixo_x = 0;
		int eixo_y = 0;
		
		System.out.println("Insira o eixo x: ");
		eixo_x = sc.nextInt();
		System.out.println("\n");
		
		System.out.println("Insira o eixo y: ");
		eixo_y = sc.nextInt();
		System.out.println("\n");
		
		if(eixo_x >= 0 && eixo_y >= 0 ) {
			System.out.println("está localizado no Q1 ");
		} else if(eixo_x <= 0 && eixo_y >= 0) {
			System.out.println("está localizado no Q2 ");
		} else if (eixo_x <= 0 && eixo_y <= 0) {
			System.out.println("está localizado no Q3 ");
		} else if (eixo_x >= 0 && eixo_y <= 0) {
			System.out.println("está localizado no Q4 ");
		}

		sc.close();
	}

}
