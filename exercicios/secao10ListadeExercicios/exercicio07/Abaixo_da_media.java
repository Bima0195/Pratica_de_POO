/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

package exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?: ");
		int N = sc.nextInt();
		double[] vet = new double[N];
		
		double soma = 0;
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		double media = soma /N;
		System.out.println("Media do vetor: " + media);
		System.out.println("Elementos Abaixo da media: ");
		for(int i=0; i<vet.length; i++)
			if(vet[i]<media) {
				System.out.println(vet[i]);
			}
		
		
		
		sc.close();

	}

}
