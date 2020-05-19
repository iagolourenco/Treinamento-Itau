package teste;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.Endereco;

	public class TestConstrutor {

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

	ContaCorrente cc = new ContaCorrente(
			(double) 20,
			new Cliente(
					"Iago Lourenco"
					,"338062198-69"
					,new Endereco(
							"Rua Aracy Lara Cruz"
							,(short) 109
							,"CASA"
							,"Vila Francisco de Tulio"
							,"Franco da rocha, SP - Brasil"
							)
					)
			);
	
	
	System.out.println(cc.getAll());
		
	}

}
