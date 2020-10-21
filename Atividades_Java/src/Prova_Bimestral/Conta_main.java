package Prova_Bimestral;

import java.util.Scanner;

public class Conta_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarando as variáveis, Scanner e Random
		String nome;
		double inicial;
		Scanner entrada = new Scanner(System.in);
		int conta = 0;

		//Obtendo os dados iniciais do Cliente
		System.out.println("Cadastrando novo cliente.");
		System.out.print("Entre com seu nome: ");
		nome = entrada.nextLine();

		System.out.print("Entre com seu nome: ");
		conta = entrada.nextInt();

		System.out.print("Entre com o valor inicial depositado na conta: ");
		inicial = entrada.nextDouble();

		//Criando a conta de um cliente
		Conta minhaConta = new Conta(nome, conta, inicial);
		minhaConta.iniciar();
		}


	}


