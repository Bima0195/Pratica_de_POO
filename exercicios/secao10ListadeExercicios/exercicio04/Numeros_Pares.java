/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.*/


package exercicio04;

import java.util.Scanner;

public class Numeros_Pares {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?: ");
		int N = sc.nextInt();
		int[] vet = new int[N];
		
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("Numeros pares: ");
		int contPar = 0;
		for(int i=0; i<vet.length; i++) {
			if(vet[i] % 2 ==0) {
				contPar++;
				System.out.print(vet[i] + " ");
			}
			
			
		}
		System.out.println();
		System.out.println("Quantidade de pares = " + contPar);
		
		
		
		
		
		sc.close();
	}

}
