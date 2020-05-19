package teste;
import modelo.Endereco;
import modelo.ContaCorrente;

import javax.swing.JOptionPane;

import modelo.Cliente;

public class TestSetAll {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg);
	}

	public static short sh(String msg) {
		return Short.parseShort(s(msg));
	}
	
	public static double d(String msg) {
		return Double.parseDouble(s(msg));
	}
	
	public static void main(String[] args) {
	
		Endereco e = new Endereco();
		ContaCorrente cc = new ContaCorrente();
		Cliente c = new Cliente();
		
		System.out.println("Cadastro Endereco: ");
		e.setAll(s("Rua: "), sh("Numero: "), s("Complemento: "), s("Bairro"), s("CEP"));
		
		System.out.println("Cadastro Cliente: ");
		c.setAll(s("Nome: "), s("CPF: "), e);
		
		System.out.println("Cadastro Conta Corrente: ");
		cc.setAll(d("Digite o saldo: "), c);
		
		System.out.println(cc.getAll());
		
	}

}
