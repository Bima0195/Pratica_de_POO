package main;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoVetor;

public class VetorProduto {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ProdutoVetor[] vet = new ProdutoVetor[N];
		
		for(int i=0; i<vet.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vet[i] = new ProdutoVetor(nome, preco);
		}
		
		double soma = 0.0;
		for(int i=0; i<vet.length; i++) {
			soma += vet[i].getPreco();
			
		}
		
		double media = soma / vet.length;
		System.out.printf("Media de preco: %.2f", media);
		
		
		sc.close();
	}

}
