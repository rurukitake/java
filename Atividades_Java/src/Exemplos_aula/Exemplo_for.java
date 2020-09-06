package Exemplos_aula;

import java.util.Scanner;

public class Exemplo_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Digite um valor: ");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fat = 1;
		for (int i=1; i<=n; i++) {
		fat = fat * i;
		}

		System.out.printf("Fatorial de %d é %d" , n , fat);
		sc.close();
	}

}
