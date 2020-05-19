package br.com.universidade.modelo;

public class Aluno extends Pessoa{

	private int numeroMatricula;
	private String responsavel;

	public void setAll(String nome, String email, String fone, int numeroMatricula, String responsavel) {
		super.setAll(nome, email, fone);
		this.numeroMatricula = numeroMatricula;
		this.responsavel = responsavel;
	}

	public String getAll() {
		return numeroMatricula + "\n"+ responsavel + "\n" + super.getAll();
	}

	public Aluno() {
		super();

	}

	public Aluno(String nome, String email, String fone, int numeroMatricula, String responsavel) {
		super(nome, email, fone);
		this.numeroMatricula = numeroMatricula;
		this.responsavel = responsavel;

	}


	public int getNumeroMatricula() {
		return numeroMatricula;
	}


	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}	



}
