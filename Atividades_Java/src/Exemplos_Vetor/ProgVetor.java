package Exemplos_Vetor;
import java.util.Locale;
import java.util.Scanner;

public class ProgVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		System.out.print("Entre com a qtd de valores para altura:");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		double[] vetor = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Entre com o %d valor de altura: ", i + 1);
			vetor[i] = obj.nextDouble();
		}
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		double media = soma / n;
		System.out.printf("Media das aulturas: %.2f%n", media);
		obj.close();
	}
		
		
	}


