package entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{
	
	private LocalDate  dataFabri;

	public ProdutoUsado(String nome, Double preco, LocalDate dataFabri) {
		super(nome, preco);
		this.dataFabri = dataFabri;
	}

	public LocalDate getDataFabricacao() {
		return dataFabri;
	}

	public void setDataFabricacao(LocalDate dataFabri) {
		this.dataFabri = dataFabri;
	}
	
	@Override
	public String precoTag() {
		return super.getNome()
				+"(usado)"
				+"$ "
				+String.format("%.2f", super.getPreco())
				+"(Fabricado: "
				+dataFabri.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+")";
		
	}
	
	

}
