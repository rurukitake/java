package Prova_Bimestral;

import java.util.Scanner;

//Author: Lucas Antonio

	class Media_X {
		public float media(float x1, float x2){
			return x1 / x2;
	}
	}

public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		Media_X m = new Media_X();

		float a = 0;
		float b = 0;
		float c = 0;
		float delta = 0;
		float x1 = 0;
		float x2 = 0;

		System.out.print("* EQUAÇÃO DE 2° GRAU *\n\n");

		System.out.print("Insira o valor de A: ");
		a = sc.nextFloat();

		System.out.print("Insira o valor de B: ");
		b = sc.nextFloat();

		System.out.print("Insira o valor de C: ");
		c = sc.nextFloat();

		delta = (b * b) - (4 * a * c);

		System.out.println("\n");

		System.out.print("DELTA: " + delta);
		System.out.println("\n");

		if (delta < 0) {
		System.out.print("NÃO E UMA RAIZ  \n\n");
		}
		else if(delta >= 0) {
		x1 = ((-b + (float)Math.sqrt(delta)) / (2 * a));

		x2 = ((-b - (float)Math.sqrt(delta)) / (2 * a));

		System.out.print("X1: " + x1);
		System.out.println("");

		System.out.print("X2: " + x2);
		System.out.println("\n");

		System.out.print("A média do x: " + m.media(x1,x2));
		}

		sc.close();
		}


}
