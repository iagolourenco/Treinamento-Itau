package modelo;

public class Professor {

	private String nome;
	private String apelido;
	private String materia;
	private Endereco endereco;
	
	public Professor(){
		
	}
	
	public Professor(String nome, String apelido, String materia, Endereco endereco){
		this.nome = nome;
		this.apelido = apelido;
		this.materia = materia;
		this.endereco = endereco;
		
	}
	
	public String getAll() {
		return "Nome: " + this.nome + "\n" + "apelido: \n" + this.apelido + "\n" + "materia: \n" + this.materia + "\n" + endereco.getAll();
	
	}

	public void setAll(String nome, String Apelido, String materia, Endereco endereco) {
		this.nome = nome;
		this.apelido = Apelido;
		this.materia = materia;
		this.endereco = endereco;
	}
	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
