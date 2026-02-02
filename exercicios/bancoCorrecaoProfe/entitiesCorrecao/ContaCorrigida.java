package entitiesCorrecao;

public class ContaCorrigida {
	
	private int numConta;
	private String titular;
	private double saldo;
	
	
	public ContaCorrigida(int numConta, String titular, double saldoInicial) {

		this.numConta = numConta;
		this.titular = titular;
		deposito(saldoInicial);
	}
	
	
	
	public ContaCorrigida(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
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
	
	
	
	public void deposito(double valor) {
		saldo += valor;
		
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.00;
		
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
