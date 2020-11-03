package Programacao_Enumeracao;

import java.util.Date;

public class Cliente {
	
	private String nome;
	private String email;
	private Date datanasc;
	
	
	public Cliente(String nome, String email, Date datanasc) {
		super();
		this.nome = nome;
		this.email = email;
		this.datanasc = datanasc;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDatanasc() {
		return datanasc;
	}


	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}


	@Override
	public String toString() {
		return "Cliente nome: " + nome + ", email: " + email + ", Data de nascimento: " + datanasc;
	}
	
	
	
	
	
	

}
