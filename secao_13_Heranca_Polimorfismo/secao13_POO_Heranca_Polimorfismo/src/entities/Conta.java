package entities;

public class Conta {
	
	private Integer num;
	private String titular;
	protected Double saldo;
	
	public Conta(){
		
	}
	
	public Conta(Integer num, String titular, Double saldo) {
		this.num = num;
		this.titular = titular;
		this.saldo = saldo;
	}





	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public Integer getNum() {
		return num;
	}



	public Double getSaldo() {
		return saldo;
	}
	
	
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.00;
	}

	
	
	
}
