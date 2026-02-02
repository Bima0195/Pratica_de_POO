package entidades;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public double novoSalario(double percentual) {
		return (salarioBruto - taxa) + salarioBruto * percentual / 100;
	}
	
	/*public String toString() {
	    return "Funcionario: " + nome
	         + "\nSalário Bruto: $ " + String.format("%.2f", salarioBruto)
	         + "\nTaxa: $ " + String.format("%.2f", taxa)
	         + "\nSalário Líquido: $ " + String.format("%.2f", salarioLiquido());
	}*/



}
