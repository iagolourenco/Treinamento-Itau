package heranca.com.br.modelo;

public class Livro extends Produto{
	
	private String isbn;
	private String autor;
	
	public void setAll(int codigo, double preco, String descricao, String isbn, String autor) {
		super.setAll(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}
	
	public String getAll() {
		return super.getAll() + "\n" + isbn + "\n" + autor ;
	}

	
	public Livro() {
		super();
	}

	
	public Livro(int codigo, double preco, String descricao, String isbn, String autor) {
		super(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
