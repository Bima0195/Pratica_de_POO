package entities;

public class ProdutoImportado extends Produto{
	
	private Double taxaImpor;
	
	public ProdutoImportado() {
		
	}
	
	public ProdutoImportado(String nome, Double preco, Double taxaImpor) {
		super(nome, preco);
		this.taxaImpor = taxaImpor;
	}

	public Double getTaxaAlfandega() {
		return taxaImpor;
	}

	public void setTaxaAlfandega(Double taxaImpor) {
		this.taxaImpor = taxaImpor;
	}
	
	public double precoTotal() {
		return super.getPreco() + taxaImpor;
	}
	
	@Override
	public String precoTag() {
		return getNome()
				+"$ "
				+String.format("%.2f",precoTotal())
				+"(Taxa Alfandegaria: $ "
				+getTaxaAlfandega()
				+")";
		
	}
	

}
