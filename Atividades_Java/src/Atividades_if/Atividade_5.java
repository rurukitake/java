package Atividades_if;

import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int codigo = 0;
		int quantidade = 0;
		int aux = 0;
		
		System.out.println("***********indice***********");
		System.out.println("\n");
		System.out.println("Codigo 1: 4x a quantidade ");
		System.out.println("Codigo 2: 4,5x a quantidade ");
		System.out.println("Codigo 3: 5x a quantidade ");
		System.out.println("Codigo 4: 2x a quantidade ");
		System.out.println("Outro codigo 1,5x a quantidade ");
		System.out.println("\n");
		
		
		System.out.println("Digite o codigo : ");
		codigo = sc.nextInt();
		System.out.println("\n");
		
		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();
		System.out.println("\n");
		
		switch(codigo) {
		
		case 1:
			aux = quantidade * 4;
			System.out.println("codigo escolhido: 1 \n");
			System.out.println("a quantidade e " +aux);
			break;
		case 2:
			System.out.println("codigo escolhido: 2 \n");
			aux = (int) (quantidade * 4.5);
			System.out.println("a quantidade e " +aux);
			break;
		case 3:
			System.out.println("codigo escolhido: 3 \n");
			aux = quantidade * 5;
			System.out.println("a quantidade e " +aux);
			break;
		case 4:
			System.out.println("codigo escolhido: 4 \n");
			aux = quantidade * 2;
			System.out.println("a quantidade e " +aux);
			break;
			default:
		System.out.println("codigo escolhido: indefinido \n");
		aux = (int) (quantidade * 1.5);
		System.out.println("a quantidade e " +aux);
		break;
		}
		
		sc.close();
		
	}

}
