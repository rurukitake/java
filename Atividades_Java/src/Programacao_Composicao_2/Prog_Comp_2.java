package Programacao_Composicao_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Programacao_Composicao_2.Comentario;
import Programacao_Composicao_2.Post;

public class Prog_Comp_2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentario c1 = new Comentario("Tenha boa viagem!");
		Comentario c2 = new Comentario("Nossa! Que incrível!");
		
		Post p1 = new Post(sdf.parse("24/12/2018 23:05:44"), "Viajando para Inglaterra",
				"Estou indo conhecer esse belo país!", 12);
		
		p1.addComentario(c1);
		p1.addComentario(c2);

		Comentario c3 = new Comentario("Boa noite");
		Comentario c4 = new Comentario("Aproveite a viagem!");
		
		Post p2 = new Post(sdf.parse("28/12/2018 23:14:19"), "Boa noite pessoal", "Vejo vcs amanha", 5);
		
		p2.addComentario(c3);
		p2.addComentario(c4);

		System.out.println(p1);
		System.out.println(p2);
	}
	}


