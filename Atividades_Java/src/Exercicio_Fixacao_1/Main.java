package Exercicio_Fixacao_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicio_Fixacao_1.Produto;
import Exercicio_Fixacao_1.ProdutoImportado;
import Exercicio_Fixacao_1.ProdutoUsado;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> list = new ArrayList<>();
		
		System.out.println("Entre com o número de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Dados do produto #" + i +": ");
			System.out.println("Comum, usado ou importado (c/u/i)? ");
			char caractere = sc.next().charAt(0);
			
			System.out.println("Nome: ");
			sc.nextLine();
			
			String nome = sc.nextLine();
			
			System.out.println("Preco: ");
			double preco = sc.nextDouble();
			
			if(caractere == 'c') {
				list.add(new Produto (nome, preco));
			}
			else if(caractere == 'u') {
				System.out.println("Data de manufatura: ");
				Date data = sdf.parse(sc.next());
				list.add(new ProdutoUsado(nome, preco, data));
			}
			else {
				System.out.println("Taxa alfandega: ");
				double taxa = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxa));
			}
			
		}
		
		System.out.println();
		System.out.println("Etiqueta de preco de produtos da lista informada: ");
		
		for(Produto prod: list) {
			System.out.println(prod.etiquetaPreco());
		}
		
		sc.close();
	}

}
