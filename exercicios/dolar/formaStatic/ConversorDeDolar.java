package formaStatic;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeDolar {
	
	
	public static double IOF = 0.06;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço do dolar atual??: ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados??: ");
		double comprar = sc.nextDouble();
		
		double c = conversor(precoDolar, comprar);
		System.out.printf("Valor a ser pago em reais = %.2f", c);

		
		sc.close();
	}
	
	public static double conversor(double precoDolar, double comprar) {
		return precoDolar * comprar + precoDolar * comprar * IOF;
		
	}

}
