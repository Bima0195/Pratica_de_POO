package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?: ");
		int N = sc.nextInt();
		double[] vet = new double[N];
		
		
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");	
			vet[i] = sc.nextDouble();
			
		}
		
	
		double soma =0;
		double media = 0;
		System.out.print("Valores =  ");
		for(int i=0; i<vet.length; i++) {
			soma += vet[i];	
			System.out.printf("%.1f ",vet[i]);
		}
		System.out.println();

		media = soma/ N;
		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Media = %.2f%n",  media);
		
		
		
		
		
		
		sc.close();
	}

}
