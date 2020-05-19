package teste;

import javax.swing.JOptionPane;

import modelo.Endereco;
import modelo.Professor;

public class TestConstrutorCheio {

	public static String s (String msg) {
		return JOptionPane.showInputDialog(msg);
	};

	public static int i (String msg) {
		return Integer.parseInt(s(msg));
	};

	public static Float f (String msg) {
		return Float.parseFloat(s(msg));
	};
	
	public static void main(String[] args) {

	//criou objeto
			//Aluno objeto;
			//instanciou o objeto
			
			Professor objetop = new Professor(
					s("Nome prof: "), 
					s("Apelido prof: "), 
					s("Materia prof: "), 
					new Endereco(
							s("Logradouro: "),
							s("Numero: "),
							s("Bairro: "),
							s("Cidade: "),
							s("UF: "),
							s("CEP: ")
							)
					);
			

			System.out.println(objetop.getAll());
			System.out.println("Ate logo...");

	
}

	
}
