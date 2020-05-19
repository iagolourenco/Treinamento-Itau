package heranca.com.br.modelo;

public class CompactDisc extends Produto{

	private String gravadora;
	private String artista;
	
	public String getAll() {
		return super.getAll() + "\n" + gravadora + "\n" + artista; 
	}
	
	public void setAll(int codigo, double preco, String descricao, String gravadora, String artista) {
		super.setAll(codigo, preco, descricao);
		this.gravadora = gravadora;
		this.artista = artista;
	}
	
	public CompactDisc() {
		super();
	}
	
	public CompactDisc(int codigo, double preco, String descricao, String gravadora, String artista) {
		super(codigo, preco, descricao);
		this.gravadora = gravadora;
		this.artista = artista;
	}
	
	public String getGravadora() {
		return gravadora;
	}
	
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	
}
