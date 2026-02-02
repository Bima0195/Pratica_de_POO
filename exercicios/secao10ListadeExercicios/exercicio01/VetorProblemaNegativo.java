/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

package exercicio01;

import java.util.Scanner;

public class VetorProblemaNegativo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?: ");
		int N = sc.nextInt();
		int[] vet = new int[N];
		
		
		for(int i=0; i<vet.length;i++) {
			System.out.print("Digite um numero: ");			
			vet[i] = sc.nextInt();
		}
		
		System.out.println("Numero negativos: ");
	    for(int i=0; i<vet.length; i++) {
	    	if(vet[i]<0) {
	    		System.out.println(vet[i]);
	    	}
	    	
	    }
		
		
		
		
		sc.close();
	}

}
