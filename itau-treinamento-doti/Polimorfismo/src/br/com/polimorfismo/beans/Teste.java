package br.com.polimorfismo.beans;
import javax.swing.JOptionPane;

public class Teste{

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}

	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}

	public static double d(String msg) {
		return Double.parseDouble(s(msg));
	}

	public static void main(String[] args) {

		Formacao objeto = null;
		char resposta = JOptionPane.showInputDialog("Escolha 1=Medio / 2=Tecnologo / 3=Bacharelado").charAt(0);
		if (resposta == '1') {
			objeto = new Medio(
					s("Descricao"),
					i("Periodo"),
					0,
					0,
					s("Tipo")
					);
		}
		else if (resposta == '2') {
			objeto = new Tecnologo(
					s("Descricao"),
					i("Periodo"),
					0,
					0,
					true
					);			
		}
		else if (resposta == '3') {
			objeto = new Bacharelado(
					s("descricao"), 
					i("periodo"), 
					0, 
					0,
					s("Projeto de conclusao"),
					i("Carga horaria: ")
					);
		}
		else {
			System.out.println("OPCAO INVALIDA");
		}

		objeto.definirDuracao();
		objeto.calcularMensalidade(0.15);
		System.out.println(objeto.getAll());

	}

}
