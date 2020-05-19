package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Pessoa;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno = new Aluno(
				"Iago Lourenco",
				"iagolourenco_@hotmail.com",
				"997044562",
				12345,
				"Georgia Bertolla Guidoni"
				);

		
		System.out.println(aluno.getAll());

	}

}
