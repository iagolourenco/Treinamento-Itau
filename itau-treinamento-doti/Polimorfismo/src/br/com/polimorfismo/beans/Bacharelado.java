package br.com.polimorfismo.beans;

import br.com.polimofirsmo.interfaces.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{

	private String projetoConclusao;
	private int cargaHorarioEstagio;

	public void calcularMensalidade(double fator) {
		super.setMensalidade((super.getDuracao() * fator * 600) + (this.cargaHorarioEstagio * 12));
	}	
	public String getTudo() {
		return super.getAll() + getAll();
	}
	
	public String getAll() {
	return "\n" + projetoConclusao + "\n" +  cargaHorarioEstagio; 
	}	
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao, int cargaHorarioEstagio) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}
	public Bacharelado() {
		super();
	}

	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao, int cargaHorarioEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.cargaHorarioEstagio = cargaHorarioEstagio;
		this.projetoConclusao = projetoConclusao;
	}
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorarioEstagio() {
		return cargaHorarioEstagio;
	}
	public void setCargaHorarioEstagio(int cargaHorarioEstagio) {
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}



}
