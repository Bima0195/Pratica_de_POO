package entities;

public class ProdutoVetor {
	
	private String nome;
	private double preco;
	
	public ProdutoVetor(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setNome(double preco) {
		this.preco = preco;
	}

}
