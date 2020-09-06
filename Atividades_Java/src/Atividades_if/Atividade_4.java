package Atividades_if;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int h_inicial = 0;
		int h_final = 0;
		int aux = 0;
		
		System.out.print("*** Horas jogadas ***\n\n");
		System.out.print("Obs. Somente o formato 24 Horas é aceito\n\n");
		
		System.out.print("Insira o horário em números inteiros, que você começou a jogar: ");
		h_inicial = sc.nextInt();
		System.out.print("\n");
		
		System.out.print("Insira o horário em  números inteiros, que você terminou de jogar: ");
		h_final = sc.nextInt();
		System.out.print("\n");
		
		if (h_inicial > h_final) {
			aux = (24 - h_inicial);
			System.out.println("O Horário total, foram de "+(aux + h_final)+":00 horas jogadas");
		}
		else if(h_inicial < h_final) {
			System.out.println("O Horário total foram de "+(h_final - h_inicial)+":00 horas jogadas");
		}
		
		sc.close();
	}

}
