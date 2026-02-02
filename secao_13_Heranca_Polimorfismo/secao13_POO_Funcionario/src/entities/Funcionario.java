package entities;

public class Funcionario {
	
	private String nome;
	private Integer horas;
	private Double valorHora;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, Integer horas, Double horastrabalhadas) {
		this.nome = nome;
		this.horas = horas;
		this.valorHora = horastrabalhadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getHorastrabalhadas() {
		return valorHora;
	}

	public void setHorastrabalhadas(Double horastrabalhadas) {
		this.valorHora = horastrabalhadas;
	}
	
	
	
	public Double pagamento() {
		return horas * valorHora;
	}

}
