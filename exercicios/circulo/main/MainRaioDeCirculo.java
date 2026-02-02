package main;

import java.util.Locale;
import java.util.Scanner;

import util.Calcular;

public class MainRaioDeCirculo {

	public static void mian(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Calcular calc = new Calcular();

		System.out.print("Informe o raio do circulo: ");
		double raio = sc.nextDouble();

		double c = Calcular.circunferencia(raio);

		double v = Calcular.volume(raio);

		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calcular.PI);

		sc.close();
	}

}
