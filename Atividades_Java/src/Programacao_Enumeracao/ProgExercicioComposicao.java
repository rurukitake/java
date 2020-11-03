package Programacao_Enumeracao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgExercicioComposicao {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/AAAA):  ");
		Date dataNasc = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNasc);
		
		System.out.println("Entre com os dados do pedido: ");
		
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido (new Date(), status, cliente);
		
		System.out.print("Quantos itens para esse pedido?  ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do " + i + " item: ");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preco do produto: ");
			double precoProduto = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			ItemPedido itemPedido = new ItemPedido(quantidade, precoProduto, produto);
			
			pedido.addItem(itemPedido);
		}
		
		System.out.println();
		System.out.println("Resumo o pedido");
		System.out.println(pedido);
		
		sc.close();
	}

}
