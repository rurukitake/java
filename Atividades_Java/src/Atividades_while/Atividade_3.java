package Atividades_while;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		List<Integer> conjunto_a = new ArrayList();
		List<Integer> conjunto_b = new ArrayList();
		List<Integer> conjunto_c = new ArrayList();
		
		int aux = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int quantidade_elementos_a = 0;
		int quantidade_elementos_b = 0;
		int quantidade_elementos_c = 0;
		int soma_conjunto_a = 0;
		int soma_conjunto_b = 0;
		int soma_conjunto_c = 0;
		
		String opc;
		
		boolean status = true;
		
		System.out.println("*** CONJUNTOS ***");
		System.out.println("");
		
		while(status == true) {
			System.out.print("Insira os valores do conjunto A: ");
			a = sc.nextInt();
			System.out.println("");
			
			conjunto_a.add(a);
			
			System.out.print("Deseja inserir mais valores no conjunto A ? s / n \n");
			opc = sc.next();
			System.out.println("");
			
			if(opc.equals("n") || opc.equals("N")) {
				status = false;
			}else {
				continue;
			}
		}
		
		status = true;
		
		while(status == true) {
			System.out.print("Insira os valores do conjunto B: ");
			b = sc.nextInt();
			System.out.println("");
			
			conjunto_b.add(b);
			
			System.out.print("Deseja inserir mais valores no conjunto B ? s / n \n");
			opc = sc.next();
			System.out.println("");
			
			if(opc.equals("n") || opc.equals("N")) {
				status = false;
			}else {
				continue;
			}
		}
		
		status = true;
		
		while(status == true) {
			System.out.print("Insira os valores do conjunto C: ");
			c = sc.nextInt();
			System.out.println("");
			
			conjunto_c.add(c);
			
			System.out.print("Deseja inserir mais valores no conjunto C ? s / n \n");
			opc = sc.next();
			System.out.println("");
			
			if(opc.equals("n") || opc.equals("N")) {
				status = false;
			}else {
				continue;
			}
		}
		
		quantidade_elementos_a = conjunto_a.size();
		for(int i = 0; i < conjunto_a.size(); i++) {
			soma_conjunto_a = soma_conjunto_a + conjunto_a.get(i);
		}
		
		quantidade_elementos_b = conjunto_b.size();
		for(int i = 0; i < conjunto_b.size(); i++) {
			soma_conjunto_b = soma_conjunto_b + conjunto_b.get(i);
		}
		
		quantidade_elementos_c = conjunto_c.size();
		for(int i = 0; i < conjunto_c.size(); i++) {
			soma_conjunto_c = soma_conjunto_c + conjunto_c.get(i);
		}
		
		System.out.println("A média do conjunto A é: " + ((float)(soma_conjunto_a/quantidade_elementos_a)));
		System.out.println("A média do conjunto B é: " + ((float)(soma_conjunto_b/quantidade_elementos_b)));
		System.out.println("A média do conjunto C é: " + ((float)(soma_conjunto_c/quantidade_elementos_c)));
		
		sc.close();
	}

}
