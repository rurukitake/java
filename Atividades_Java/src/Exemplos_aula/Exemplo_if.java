package Exemplos_aula;

import java.util.Scanner;

public class Exemplo_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // declarando objeto da classe “Scanner”
		
		int x = sc.nextInt(); // atribuindo valor int
		
		String dia;
		
		if (x == 1) {
			dia = "domingo";
		} else if (x == 2) {
			dia = "segunda";
		} else if (x == 3) {
			dia = "terca";
		} else if (x == 4) {
			dia = "quarta";
		} else if (x == 5) {
			dia = "quinta";
		} else if (x == 6) {
			dia = "sexta";
		} else if (x == 7) {
			dia = "sabado";
		} else {
			dia = "valor invalido";
		}
		String texto = (dia == "sexta") ? "sextou" : "falta muito pra sexta?";
		
		System.out.println("Dia da semana: " + dia);
		System.out.println(texto);
		
		sc.close();
	}

}
