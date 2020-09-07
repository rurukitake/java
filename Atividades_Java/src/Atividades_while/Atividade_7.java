package Atividades_while;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num_1 = 0;
		int aux = 0;
		
		List<Integer>lista_2 = new ArrayList();
		List<Integer>lista_3 = new ArrayList();
		
		System.out.println("*** Raiz Quadrada e Cúbica ***");
		System.out.println("");
		
		
		System.out.print("Insira um número desejado: ");
		num_1 = sc.nextInt();
		System.out.println("\n");
		
		for(int i = 0; i <= num_1; i++){
			aux = (int) Math.pow(i, 2);
			
			lista_2.add(aux);
		}
		
		for(int i = 0; i <= num_1; i++){
			aux = (int) Math.pow(i, 3);
			
			lista_3.add(aux);
		}
						
		
		for(int i = 1; i < lista_2.size(); i++) {
			System.out.println(" A Raiz quadra de "+ i +" é " +lista_2.get(i));
		}
		System.out.println("");
		
		for(int i = 1; i < lista_3.size(); i++) {
			System.out.println(" A Raiz cúbica de "+ i +" é " +lista_3.get(i));
		}
		System.out.println("");

	
		sc.close();
	}

}
