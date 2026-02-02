package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double saldo = 0;
		System.out.print("Insira o número da conta: ");
		int nunConta = sc.nextInt();
		System.out.print("Insira o titular da conta: ");
		String titular = sc.next();
		System.out.print("Deseja fazer algum depósito inicial (s/n)?: ");
		String resposta = sc.next();

		while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
			System.out.println("Caractere inválido. Digite apenas 's' ou 'n'.");
			System.out.print("Deseja fazer algum depósito inicial (s/n)?: ");
			resposta = sc.next();
		}

		if (resposta.equalsIgnoreCase("s")) {
			System.out.print("Insira o valor do depósito inicial: ");
			saldo = sc.nextDouble();
		} else if (resposta.equalsIgnoreCase("n")) {

		}
		Conta conta = new Conta(titular, nunConta, saldo);
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		
		System.out.print("Insira o valor do depósito: $ ");
		double valor = sc.nextDouble();
		conta.deposito(valor);
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		System.out.println();
		
		System.out.print("Insira o valor do saque: $ ");
		valor = sc.nextDouble();
		conta.saque(valor);
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);

		sc.close();
	}

}
