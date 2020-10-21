package Programacao_Enumeracao;
import java.util.Date;

public class Pedido_Exemplo {
	
	private Integer id;
	private Date momento;
	private StatusPedido status;
	
	public Pedido_Exemplo(int i, Date date, StatusPedido processando) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public void PedidoExemplo() {
		
	}

	public void PedidoExemplo(Integer id, Date momento, StatusPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Pedido ID: " + id + ", Momento: " + momento + ", Status:" + status + "]";
	}

}
