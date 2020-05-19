package br.com.polimorfismo.beans;

import br.com.polimofirsmo.interfaces.PadraoFormacao;

public class Tecnologo extends Formacao implements PadraoFormacao{
	
	private boolean planoExtendido;

	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 600);
	}

	public String getTudo() {
		return super.getAll() + getAll();
	}
	
	public String getAll() {
		return "\n" + planoExtendido;
		
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, boolean planoExtendido) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.planoExtendido = planoExtendido;
		
	}
	
	public Tecnologo() {
		super();
	}

	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoExtendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoExtendido = planoExtendido;
	}

	public boolean isPlanoExtendido() {
		return planoExtendido;
	}

	public void setPlanoExtendido(boolean planoExtendido) {
		this.planoExtendido = planoExtendido;
	}
	
	

}
