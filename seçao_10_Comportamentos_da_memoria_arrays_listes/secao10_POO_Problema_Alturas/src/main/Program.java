/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas?: ");
		int N = sc.nextInt();
		Pessoa[] vet = new Pessoa[N];

		for (int i = 0; i < vet.length; i++) {

			System.out.println();
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vet[i] = new Pessoa(nome, idade, altura);
		}

		double somaAltura = 0;
		int contIdade = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getIdade() < 16) {
				contIdade++;

			}
			somaAltura += vet[i].getAltura();
		}

		double alturaMedia = somaAltura / N;
		double percentual = (double)contIdade * 100 / N;
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos:  %.1f%%%n ", percentual);

		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getIdade() < 16) {
				System.out.println(vet[i].getNome());
			}
		}

		sc.close();
	}

}
