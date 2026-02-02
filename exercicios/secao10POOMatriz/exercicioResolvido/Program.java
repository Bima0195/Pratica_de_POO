/*Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz.*/


package exercicioResolvido;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] mat = new int[N][N];

		for (int i=0; i<mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();

			}

		}
		
		
		System.out.println("Numeros da diagonal principal: ");
		for (int i = 0; i < mat.length; i++) {
			  System.out.print(mat[i][i] + " ");
				}
		
		System.out.println();
		
		int cont =0;
		for (int i=0; i<mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] <0) {
					cont++;
				}

			}

		}
		
		
		System.out.println("Numeros negativos: " + cont);
		
		
		

	

		sc.close();
	}

}
