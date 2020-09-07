package Atividades_while;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num_1 = 0;
		
		List<Integer> lista_valor = new ArrayList();
		
		System.out.println("*** DIVISOR ***");
		System.out.println("");
		
		System.out.print("Insira um número inteiro: ");
		num_1 = sc.nextInt();
		System.out.println("");
		
		for(int i = 1; i <= num_1; i++){
			if(num_1 % i == 0) {
				lista_valor.add(i);
			}else {
				continue;
			}
		}
		
		System.out.println("O valor digitado foi "+num_1);
		System.out.println("");
		
		System.out.println("Seus divisores são:");
		
		for(int i = 0; i < lista_valor.size(); i++) {
			System.out.println(lista_valor.get(i));
		}
		
		sc.close();
	}

}
