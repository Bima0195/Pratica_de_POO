package entitie;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;	
	
	
	public double valorTotalEmEstoque() {
		return preco*quantidade;
	}
	
	public void addProdutos(int quantidade2) {
			this.quantidade += quantidade2;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString(){
		return nome
				+ ", $"
				+String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+" quantidades, Total: $ "
				+ String.format("%.2f", valorTotalEmEstoque()) ;
		
	}

}
