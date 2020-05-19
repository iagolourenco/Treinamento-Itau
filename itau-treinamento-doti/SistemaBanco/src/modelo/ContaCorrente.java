package modelo;
import modelo.Cliente;

public class ContaCorrente {
	
	private double saldo;
	private Cliente titular;
	
	public double retornaSaldo() {
		return saldo;
	}
	
	public String getAll() {
		return "Titular: " + titular.getAll() + "\nSaldo: " + saldo;	
		
	}

	public void setAll(double Saldo, Cliente titular) {
		this.saldo = saldo;
		this.titular = titular;
		
	}
	
	public ContaCorrente() {
		super();
	}


	public ContaCorrente(double saldo, Cliente titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	
	
	
	

}
