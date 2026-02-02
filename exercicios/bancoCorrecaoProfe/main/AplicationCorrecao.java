package main;

import java.util.Locale;
import java.util.Scanner;

import entitiesCorrecao.ContaCorrigida;



public class AplicationCorrecao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaCorrigida conta;
		
		System.out.print("Insira o número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Insira o titular da conta: ");
		String titular = sc.next();
		System.out.print("Deseja fazer algum depósito inicial (s/n)?: ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.print("Insira o valor do depósito inicial: ");
			double saldoInicial = sc.nextDouble();
			conta = new ContaCorrigida(numConta, titular, saldoInicial);
		}
		else {
			conta = new ContaCorrigida(numConta, titular);
		}
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira o valor do depósito: $ ");
		double saldoInicial = sc.nextDouble();
		conta.deposito(saldoInicial);
		
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		
		System.out.println();
		System.out.print("Insira o valor do depósito: $ ");
		 saldoInicial = sc.nextDouble();
		conta.saque(saldoInicial);
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
	

		
		sc.close();

	}

}
