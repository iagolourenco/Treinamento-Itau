package modelo;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	private String email;
	private Endereco endereco;
	
	public Aluno() {
		
	}
	
	public Aluno(int numeroMatricula, String nome, String email, Endereco endereco) {
		this.numeroMatricula = numeroMatricula;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}
	
	public String getAll() {
		return "Informações básicas do aluno : "
				+"\n"+nome
				+"\n"+numeroMatricula
				+"\n"+email
				+"\n"+endereco.getAll();
	}
	public void setAll(String nome, int numeroMatricula, String email, Endereco endereco) {
		this.nome=nome;
		this.numeroMatricula=numeroMatricula;
		this.email=email;
		this.endereco=endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
