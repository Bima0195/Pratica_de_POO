package entities;

public class ContaEmpresa extends Conta {
	
	private double limiteEmprestimo;

	public ContaEmpresa(Integer num, String titular, Double saldoInicial, double limiteEmprestimo) {
		super(num, titular, saldoInicial);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	
	public void emprestimo(double valor) {
		if(valor <= limiteEmprestimo) {
			deposito(valor);
		}
	}
	
	/*Palavra super

	É possível chamar a implementação da superclasse usando a palavra super.

	Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja realizar o
	saque normalmente da superclasse, e descontar mais 2.0.*/
	
	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo -=2.0;
	}
	
	
	
	

}
