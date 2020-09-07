package Atividades_while;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		float num_1 = 0;
		float num_2 = 0;
		
		boolean status = true;
		
		String opc;
		
		System.out.println("*** DIVISAO ***");
		System.out.println("");
		
		while(status == true) {
			System.out.print("Insira o primeiro número: ");
			num_1 = sc.nextFloat();
			System.out.println("");
			
			System.out.print("Insira o segundo número: ");
			num_2 = sc.nextFloat();
			System.out.println("");
			
			if(num_2 > 0 || num_2 < 0){
				System.out.print("O resultado da divisão " + num_1 + "/"+ num_2 + " é: "+((float)(num_1/num_2)));
				System.out.println("\n");
			}else{
				System.out.println("Impossível dividir por 0!");
			}
			
			System.out.println("Deseja realizar outra divisão? s / n");
			opc = sc.next();
			
			if(opc.equals("s") || opc.equals("S")) {
				continue;
			}else {
				status = false;
			}
			
		}
		
		System.out.println("Fim!!");
		
		sc.close();
	}

}
