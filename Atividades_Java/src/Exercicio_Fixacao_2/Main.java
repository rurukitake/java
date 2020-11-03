package Exercicio_Fixacao_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicio_Fixacao_2.Contribuinte;
import Exercicio_Fixacao_2.PFisica;
import Exercicio_Fixacao_2.PJuridica;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.println("Entre com o número de contribuintes: ");
		int n = sc.nextInt();		
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Dados do "+i+"° contribuinte: ");
			System.out.println("Pessoa física ou juridica? (f/j) ");
			char caracter = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Informe o rendimento anual: ");
			double rendimento = sc.nextDouble();
			
			if(caracter == 'f') {
				System.out.println("Informe despesa com saude: ");
				double despesasaude = sc.nextDouble();
				list.add(new PFisica(nome, rendimento, despesasaude));
			}
			else {
				System.out.println("Informe o número de funcionários: ");
				int numerofuncionarios = sc.nextInt();
				list.add(new PJuridica(nome, rendimento, numerofuncionarios));
			}
		}
		
		double soma = 0.0;
		
		System.out.println();
		System.out.println("Taxas que foram pagas: ");
		
		for(Contribuinte contrib: list) {
			double tx = contrib.taxa();
			System.out.println(contrib.getNome() + ": R$ " + String.format("%.2f", tx));
			soma += tx;
		}
		
		System.out.println();
		System.out.println("Total de taxas pagas, foram R$ " + String.format("%.2f", soma));
		
		sc.close();

	}

}
