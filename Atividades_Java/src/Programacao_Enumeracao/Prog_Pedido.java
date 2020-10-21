package Programacao_Enumeracao;

import java.util.Date;

import Programacao_Enumeracao.Pedido_Exemplo;
import Programacao_Enumeracao.StatusPedido;

public class Prog_Pedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pedido_Exemplo pedido = new Pedido_Exemplo(1234, new Date(),  StatusPedido.PROCESSANDO);
		
		System.out.println(pedido);
		
		StatusPedido sp1 = StatusPedido.ENTREGUE; // instanciando um objeto do tipo StatusPedido
		StatusPedido sp2 = StatusPedido.valueOf("PROCESSANDO"); // convertendo string para a instancia do tipo enumerado (enum)
		
		System.out.println(sp1);
		System.out.println(sp2);
	}
	}


