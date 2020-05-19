package heranca.com.br.modelo;

public abstract class Produto {


	private int codigo;
	private double preco;
	private String descricao;


	public String getAll () {
		return codigo + "\n" + preco + "\n" + descricao;

	}

	public void setAll(int codigo, double preco, String descricao) {
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}


	public Produto(int codigo, double preco, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

	public Produto() {

	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String calculaValorFinal (char opcao, double valor) {
		if (opcao=='L') {
			valor = valor + (valor * (5/100));
			return "O valor do seu Livro e: " + valor;
		}
		else {
			valor = valor + (valor * (15/100));
			return "O valor do seu CD e: " + valor;
		}
		
		
	}

}
