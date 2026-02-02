/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/

package exercicio05;

import java.util.Scanner;

public class Maior_Posicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar?: ");
		int N = sc.nextInt();
		int[] vet = new int[N];
		
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um nume: ");
			vet[i] = sc.nextInt();
		}
		
		int maior = vet[0];
		int posmaior = 0;
		for(int i=0; i<vet.length; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				posmaior = i;
				
			}
		}
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Posição do maior valor =  " + posmaior);
		
		
		sc.close();

	}

}
