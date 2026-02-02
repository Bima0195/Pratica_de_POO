package entities;

public class PessoaJuridica extends Pessoa {

	private Integer funcionario;

	public PessoaJuridica() {

	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionario) {
		super(nome, rendaAnual);
		this.funcionario = funcionario;
	}

	public Integer getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Integer funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public double imposto() {
		double imposto = 0;
		if(funcionario <= 10) {
			imposto =  super.getRendaAnual() * 0.16;
		}
		else {
			imposto = super.getRendaAnual() * 0.14;
		}
          
          
		return imposto;
	}

	@Override
	public String paid() {
		return getNome() + ": $" + String.format("%.2f", imposto());
	}

}
