/*Bloco try
• Contém o código que representa a execução normal do trecho de código que
pode acarretar em uma exceção
• Bloco catch
• Contém o código a ser executado caso uma exceção ocorra
• Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido)*/

package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Progam {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vect = sc.nextLine().split(" ");
		int posicao = sc.nextInt();
		System.out.println(vect[posicao]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição invalida");
		}
		catch(InputMismatchException e) {
			System.out.println("Caracter invalido");
		}
		
		System.out.println("Fim do progrma");
	
		
		
		sc.close();
	}

}
