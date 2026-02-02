package entities;

public class PessoaFisica extends Pessoa{
	
	private Double saude;
	
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, Double rendaAnual, Double saude) {
		super(nome, rendaAnual);
		this.saude = saude;
	}
	
	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}

	@Override
	public double imposto() {
		double imposto = 0;
        if(super.getRendaAnual() <= 2000.00) {
			imposto = super.getRendaAnual() * 0.15 - getSaude() * 0.50;
		}
        
        else {
        	imposto = super.getRendaAnual() * 0.25 - getSaude() * 0.50;
        }
    	return Math.max(0, imposto);
		
	}
	
	@Override
	public String paid() {
		return getNome()
			   +": $"
			   +String.format("%.2f", imposto());
	}
	

}
