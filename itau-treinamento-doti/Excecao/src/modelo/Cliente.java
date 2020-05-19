package modelo;

public class Cliente {

	private String nome;
	private String email;
	
	public String getAll() {
		return nome + "\n" + email;
	}
	
	public void setAll(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	
	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if(nome.length() <= 50 ) {
			this.nome = nome;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
