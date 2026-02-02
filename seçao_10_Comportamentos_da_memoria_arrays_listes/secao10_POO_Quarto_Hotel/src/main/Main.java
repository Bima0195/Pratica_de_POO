package main;

import java.util.Scanner;

import entities.Estudante;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Estudante[] vet = new Estudante[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int N = sc.nextInt();
	
	
		for(int i=0; i<N; i++) {
			System.out.println("Aluguel #" + (i+1) + ":");
			System.out.printf("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("E-mail: ");
			String email = sc.next();
			;
			System.out.print("Quarto: ");
			int numQuarto = sc.nextInt();
			vet[numQuarto] = new Estudante(nome, email);
	        
	        
		}
			
		System.out.println();
		System.out.println("Quartos ocupados");
		for(int i=0; i<10; i++) {
			if(vet[i]!= null) {
				System.out.println(i+": " + vet[i]);
			}
		}
		
	
		
		sc.close();

	}

}