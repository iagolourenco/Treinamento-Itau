package heranca.com.br.implementacao;

import javax.swing.JOptionPane;

import heranca.com.br.modelo.CompactDisc;
import heranca.com.br.modelo.Livro;

public class testeAll {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}

	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}

	public static double d(String msg) {
		return Double.parseDouble(s(msg));
	}
	
	
	public static void main (String args[]) {

		Livro livro = new Livro();
		CompactDisc cd = new CompactDisc();

		String resposta = null;

		do {

			resposta = s("Digite L para livro ou C para CD:");
			
			if(resposta.contentEquals("L")) {
				livro.setAll(
						i("Digite o codigo: "),
						d("Digite o valor: "),
						s("Digite a descricao: "),
						s("Digite o ISBN: "),
						s("Digite o autor: ")
						);
			}
				else if (resposta.contentEquals("C")) {
					cd.setAll(
							i("Digite o codigo: "),
							d("Digite o valor: "),
							s("Digite a descricao: "),
							s("Digite a gravadora: "), 
							s("Digite o nome do artista: "));
				}
				else
				{
				System.out.println("DIGITE APENAS <L> PARA LIVRO OU <C> PARA CD!");	
				}

			}while(!resposta.contentEquals("C") || !resposta.contentEquals("L"));

		
}
}
