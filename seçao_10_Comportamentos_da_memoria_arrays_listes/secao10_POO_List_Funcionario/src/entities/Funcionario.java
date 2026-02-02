package entities;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public double getSalario() {
		return salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario += salario * percentual /100;
	}
	
	public String toString() {
		return 	getId()
				+", "
				+getNome()
				+", "
				+String.format("%.2f", getSalario());
	}

}
