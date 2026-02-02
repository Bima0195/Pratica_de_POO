package entities;



public class Conta {

	public static double TAXA = 5.00;
	
	private int numConta;
	private String titular;
	private double saldo; 
	
	public Conta(String titular, int numConta, double saldo) {	
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo; 
		
	}
	
	public String getTitular() {
		return titular;
		
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double deposito(double valor) {
		return saldo += valor;
	}
	
	public double saque(double valor) {
		  saldo = (saldo -= valor) - TAXA;
		 		 
		 return saldo;
		
	}
	
	public String toString() {
		return "Conta "
				+numConta
				+", "
				+"Titular: "
				+", "
				+titular
				+", "
				+"Saldo: $ "
				+String.format("%.2f", saldo);
	}

}
