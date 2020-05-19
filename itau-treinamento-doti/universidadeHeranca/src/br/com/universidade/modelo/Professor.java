package br.com.universidade.modelo;

public class Professor extends Pessoa{

	private String apelido;
	private String materia;

	public void setAll(String nome, String email, String fone, String apelido, String materia) {
		super.setAll(nome, email, fone);
		this.apelido = apelido;
		this.materia = materia;
	}

	public Professor() {
		super();

	}

	public Professor(String nome, String email, String fone, String apelido, String materia) {
		super(nome, email, fone);
		this.apelido = apelido;
		this.materia = materia;
	}	

	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}



}
