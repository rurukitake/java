package Exemplos_Vetor;
import java.util.Locale;
import java.util.Scanner;
import Exemplos_Vetor.Produto;

public class ProgVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner obj = new Scanner(System.in);
		System.out.print("Entre com a qtd de produtos: ");
		int n = obj.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		for (int i = 0; i < vetor.length; i++) { // lenght é tamanho 
			obj.nextLine(); // para pular linha 
			System.out.printf("Informe o nome do produto %d: ", i + 1);
			String nome = obj.nextLine();
			System.out.printf("Informe o preco do produto %d: ", i + 1);
			double preco = obj.nextDouble();
			vetor[i] = new Produto(nome, preco); // instanciando um vetor de produtos
		}
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		double media = soma / vetor.length;
		System.out.printf("Media dos precos = %.2f%n", media);
		obj.close();
	}
	}


