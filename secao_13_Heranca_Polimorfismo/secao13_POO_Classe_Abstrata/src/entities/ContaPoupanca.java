package entities;

//A palavra "final" na classe não permite que a mesma seja herdada por outra classe. 
public final class ContaPoupanca extends Conta{
	
	private double taxadeJuros;
	
	
	public ContaPoupanca() {
		super();
	}
	
	
	public ContaPoupanca(Integer num, String titular, Double saldo, double taxadeJuros) {
		super(num, titular, saldo);
		this.taxadeJuros = taxadeJuros;
		
	}
	
	public double getTaxadeJuros() {
		return taxadeJuros;
	}
	
	public void setTaxadeJuros(Double taxadeJuros) {
		this.taxadeJuros = taxadeJuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxadeJuros;
	}
	
// Já a palavra "final" no metodo não permite que o mesmo seja sobreescrito. 
	
	/* Sobreposição ou sobrescrita
•      É a implementação de um método de uma superclasse na subclasse*/
	@Override
	public void saque(double valor) {
		saldo -= valor;
	}

}
