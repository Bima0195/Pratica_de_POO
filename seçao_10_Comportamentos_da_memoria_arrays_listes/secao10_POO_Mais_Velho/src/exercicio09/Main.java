/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/


package exercicio09;

import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar?: ");
		int N = sc.nextInt();
		Pessoa[] vetPessoa = new Pessoa[N];
		
		
		for(int i=0; i<vetPessoa.length; i++) {
			System.out.printf("Dados da %dº pessoa: %n", i+1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vetPessoa[i] = new Pessoa(nome, idade);
			
		}
		
		int maisVelho = 0;
		String nomemaisvelho = null;
		for(int i=0; i<vetPessoa.length; i++) {
			if(vetPessoa[i].getIdade() > maisVelho) {
				maisVelho = vetPessoa[i].getIdade();
				nomemaisvelho = vetPessoa[i].getNome();
				
			}
			
		}
		
		System.out.println("Pessoa mais velha: " + nomemaisvelho);
		
		sc.close();
	}

}
