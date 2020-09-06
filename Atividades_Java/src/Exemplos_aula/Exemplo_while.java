package Exemplos_aula;

import java.util.Scanner;

public class Exemplo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Digite a senha: ");
		Scanner sc = new Scanner(System.in);
		int senha = sc.nextInt();
		while (senha != 2020) {
		System.out.println("Senha Invalida");
		senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}

}
