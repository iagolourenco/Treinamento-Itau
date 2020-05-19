package teste;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Endereco;
import modelo.Professor;

public class TestSetAll {

	public static void main(String[] args) {
		//criou objeto
		//Aluno objeto;
		//instanciou o objeto
		Aluno objetoa = new Aluno();
		Professor objetop = new Professor();
		Endereco objetoe = new Endereco();

		
		objetoe.setAll(
				JOptionPane.showInputDialog("Digite o logradouro: ").toLowerCase()
				,JOptionPane.showInputDialog("Digite o numero: ").toLowerCase()
				,JOptionPane.showInputDialog("Digite o bairro: ").toLowerCase()
				,JOptionPane.showInputDialog("Digite o cidade: ").toLowerCase()
				,JOptionPane.showInputDialog("Digite o uf: ").toLowerCase()
				,JOptionPane.showInputDialog("Digite o cep: ").toLowerCase()
				);

		System.out.println(objetoe.getAll());

		
		objetoa.setAll(
				 JOptionPane.showInputDialog("Digite o nome do aluno: ").toLowerCase()
				,Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula do aluno: ").toLowerCase())
				,JOptionPane.showInputDialog("Digite o email do aluno: ").toLowerCase()
				,objetoe
				);

		System.out.println(objetoa.getAll());		
		
		
		objetop.setAll(
				 JOptionPane.showInputDialog("Digite o nome do prof: ").toLowerCase()
				,JOptionPane.showInputDialog("Digite o apelido do prof: ").toLowerCase()
				,JOptionPane.showInputDialog("Digite o materia do profAS"
						+ "DA"
						+ ": ").toLowerCase()
				,objetoe
				);

		System.out.println(objetop.getAll());

		
		

		System.out.println(objetop.getAll());

		System.out.println("Ate logo...");

	}

}
