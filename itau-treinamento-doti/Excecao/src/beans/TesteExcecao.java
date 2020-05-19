package beans;
import javax.swing.JOptionPane;

import excecao.Excecao;
import modelo.Cliente;

public class TesteExcecao {

	public static void main(String[] args) {

		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
			System.out.println(numero);
			int vetor[] = new int[2];
			vetor[4] = 18;

			String nome = "";

			System.out.println(nome.length());

			Cliente c = new Cliente();
			c.setNome(null);

		}
		catch (Exception e) {
			System.out.println(new Excecao().tratarExcecao(e));
		}
		finally {
			System.out.println("Tenha um bom dia");
		}

	}

}
