package Exemplos_aula;

import java.util.Locale;
import java.util.Scanner;

import Classes.Aluno;

public class Atividade_alunos_notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno: ");
		aluno.nome = obj.nextLine();
		
		System.out.println("Informe a nota 1: ");
		aluno.nota_1 = obj.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		aluno.nota_2 = obj.nextDouble();
		
		System.out.println("Informe a nota 3: ");
		aluno.nota_3 = obj.nextDouble();
		
		
		System.out.printf("Nota final e: %.2f%n", aluno.nota_final() );
		
		
		if (aluno.nota_final() < 60.0) {
			System.out.println("Aluno REPROVADO ");
			System.out.printf("Faltou %.2f pontos para ser aprovado %n", aluno.faltar_pontos());
			
			
		}else {
			System.out.println("Parabens - APROVADO ");
		}
		
		obj.close();
	}

}
