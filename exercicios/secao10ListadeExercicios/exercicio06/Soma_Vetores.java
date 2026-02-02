/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/

package exercicio06;

import java.util.Scanner;

public class Soma_Vetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?: ");
		int N = sc.nextInt();
		int[] vetA = new int[N];
		int[] vetB = new int[N];
		int[] vetC = new int[N];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i=0; i<vetA.length; i++) {
			vetA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B:");
		for(int i=0; i<vetB.length; i++) {
			vetB[i] = sc.nextInt();
		}
		
		System.out.println("Vetor C");
		for(int i=0; i<vetC.length; i++) {
			vetC[i] = vetA[i] + vetB[i];
			System.out.println(vetC[i]);
		}
		
		sc.close();
	}

}
