package Exercicio_Fixacao_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataManufatura;

	public ProdutoUsado(String nome, Double preco, Date dataManufatura) {
		super(nome, preco);
		this.dataManufatura = dataManufatura;
	}

	public Date getDataManufatura() {
		return dataManufatura;
	}
	public void setDataManufatura(Date dataManufatura) {
		this.dataManufatura = dataManufatura;
	}
	
	@Override
	public String etiquetaPreco() {
		return getNome() + "(Usado) R$ " + String.format("%.2f", getPreco()) + " (Data manufatura): " + sdf.format(dataManufatura);
	}

}
