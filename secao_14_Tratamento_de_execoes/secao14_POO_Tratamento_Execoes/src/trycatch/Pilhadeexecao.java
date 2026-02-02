package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pilhadeexecao {

	public static void main(String[] args) {

		metodo2();
		System.out.println("Fim do progrma");

	}
	
	public static void metodo1() {
		System.out.println("****Metodo1 Start****");
		metodo2();	
		System.out.println("****Metodo2 Fim****");
	}
	
	public static void metodo2() {
		System.out.println("****Metodo2 Start****");

		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vect = sc.nextLine().split(" ");
		int posicao = sc.nextInt();
		System.out.println(vect[posicao]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição invalida");
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException e) {
			System.out.println("Caracter invalido");
		}		
		
		sc.close();
		System.out.println("****Metodo2 Fim****");
	}
		
	

}
