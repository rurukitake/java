package Programacao_Enumeracao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private StatusPedido status;
	
	private Cliente cliente;
	
	
	private List<ItemPedido> itens = new ArrayList<>();


	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }


	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public StatusPedido getStatus() {
		return status;
	}


	public void setStatus(StatusPedido status) {
		this.status = status;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem( ItemPedido item) {
		itens.add(item);
	}
	
	public void removeItem( ItemPedido item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		
		for(ItemPedido item : itens) {
			soma+= item.subTotal();
		}
		return soma; 
	}


	@Override
	public String toString() {
		StringBuilder obj = new StringBuilder();
		obj.append("Data do pedido: ");
		obj.append(sdf.format(momento) + "\n");
		obj.append("Status do pedido: ");
		obj.append(status + "\n");
		obj.append("Cliente: ");
		obj.append(cliente + "\n");
		obj.append("Itens do pedido: \n");
		
		for(ItemPedido item: itens) {
			obj.append(item + "\n");
		}
		
		obj.append("Total do pedido: ");
		obj.append(String.format("%.2f", total()));
		
		return obj.toString();
	}
	
	
	
}
