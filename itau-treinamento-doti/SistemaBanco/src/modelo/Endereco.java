package modelo;

public class Endereco {

	private String rua;
	private short numero;
	private String complemento;
	private String bairro;
	private String cep;
	
	public void setQtde (int pQtde) {
		
	}

	public void getQtde(int pQtde) {
		
	}
	
	public String getAll() {
		return "Endereco completo: " 
				+"\n" + rua
				+"\n" + numero
				+"\n" + complemento
				+"\n" + bairro
				+"\n" + cep;
	}
	
	public void setAll(String rua, short numero, String complemento, String bairro, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}
	
	public Endereco() {
		super();
	}
	
	public Endereco(String rua, short numero, String complemento, String bairro, String cep) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
	
}
