package coverter;

import java.util.Locale;
import java.util.Scanner;

import entidade.ConversorDeMoeda;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço do dolar atual?: ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("Quanto vai comprar?: ");
		double comprar = sc.nextDouble();
		
		ConversorDeMoeda.conversor(comprar, precoDolar);
		
		
		System.out.printf("Valor a ser pago em reais = %.2f", ConversorDeMoeda.conversor(comprar, precoDolar));
		
		
		
		sc.close();
		
	}

}
