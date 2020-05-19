package teste;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Endereco;
import modelo.Professor;

public class TestSetIndividual {
	
	public static void main(String[] args) {

	//criou objeto
			//Aluno objeto;
			//instanciou o objeto
			Aluno objetoa = new Aluno();
			Professor objetop = new Professor();
			Endereco objetoe = new Endereco();

			objetoe.setLogradouro(JOptionPane.showInputDialog("Logradouro: "));
			objetoe.setNumero(JOptionPane.showInputDialog("Numero: "));
			objetoe.setBairro(JOptionPane.showInputDialog("Bairro: "));
			objetoe.setCidade(JOptionPane.showInputDialog("Cidade: "));
			objetoe.setUf(JOptionPane.showInputDialog("UF: "));
			objetoe.setCep(JOptionPane.showInputDialog("CEP: "));
			
			objetoa.setNome(JOptionPane.showInputDialog("Nome aluno: "));
			objetoa.setNumeroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Nr matricula aluno: ")));
			objetoa.setEmail(JOptionPane.showInputDialog("Email aluno: "));
			
			objetop.setNome(JOptionPane.showInputDialog("Nome prof: "));
			objetop.setApelido(JOptionPane.showInputDialog("Apelido prof: "));
			objetop.setMateria(JOptionPane.showInputDialog("Materia prof: "));
			
			System.out.println("Aluno info: ");
			objetoa.getAll();
			System.out.println("");
			System.out.println("Prof info: ");
			objetop.getAll();
			System.out.println("");
			System.out.println("Endereco info: ");
			objetoe.getAll();
			
			
			
			
			
			System.out.println("Ate logo...");

	
}

}