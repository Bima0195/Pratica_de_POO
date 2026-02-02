package entidade;

public class ConversorDeMoeda {
	
	public static double IOF = 0.06;
	
	//public double precoDolar;
	//public double comprar;
	
	public static double conversor(double comprar, double precoDolar) {
		return comprar * precoDolar + comprar * precoDolar * IOF;
	}

}
