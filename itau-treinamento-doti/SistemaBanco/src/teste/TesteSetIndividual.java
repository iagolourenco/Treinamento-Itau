package teste;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.Endereco;

public class TesteSetIndividual {

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

		Cliente c = new Cliente();
		ContaCorrente cc = new ContaCorrente();
		Endereco e = new Endereco();
		
		System.out.println("PREENCHIMENTO ENDERECO: ");
		e.setRua(s("Digite a rua: "));
		e.setNumero(sh("Digite o numero: "));
		e.setComplemento(s("Digite o complemento: "));
		e.setBairro(s("Digite o bairro: "));
		e.setCep(s("Digite o CEP: "));
		System.out.println("FIM ENDERECO: ");
		
		System.out.println("PREENCHIMENTO CLIENTE: ");
		c.setNome(s("Nome Cliente: "));
		c.setCpf(s("CPF Cliente: "));
		c.setEndereco(e);
		System.out.println("FIM CLIENTE: ");
		
		System.out.println("PREENCHIMENTO CONTA CORRENTE: ");
		cc.setTitular(c);
		cc.setSaldo(d("Digite o saldo atual do cliente " + c.getNome() + ": "));
		System.out.println("FIM CONTA CORRENTE: ");
		
		System.out.println("get cc");
		System.out.println(cc.getAll());
		System.out.println("get c");
		System.out.println(c.getAll());
		System.out.println("get e");
		System.out.println(e.getAll());

	}

}
