package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class MainRetangulo {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo r;
		r = new Retangulo();
		
		System.out.println("Insira a largura e a altura do retângulo: ");
		r.altura = sc.nextDouble();
		r.largura = sc.nextDouble();
		
		System.out.println(r);
		
		
		sc.close();
	}

}
