package Programacao_Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Programacao_Composicao.Departamento;
import Programacao_Composicao.Hora_Contrato;
import Programacao_Composicao.NivelTrabalhador;
import Programacao_Composicao.Trabalhador;

public class Prog_Composicao {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String departamentoNome = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador:");
		System.out.print("Nome: ");
		String trabalhadorNome = sc.nextLine();
		System.out.print("Nível: ");
		String niveltrabalhador = sc.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(trabalhadorNome, NivelTrabalhador.valueOf(niveltrabalhador), salarioBase, new Departamento(departamentoNome));
		
		System.out.print("Qts contratos para esse trabalhador? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Contrato #" + i + " data:");
			System.out.print("Data (DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duraçao (horas): ");
			int horas = sc.nextInt();
			Hora_Contrato contrato = new Hora_Contrato(dataContrato, valorPorHora, horas);
			trabalhador.addContract(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com mes e ano para calcular renda (MM/AAAA): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda para " + mesAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
		
		sc.close();
	}
	}


