package main;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class MainFunci {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario f = new Funcionario();

		System.out.println("Informe os dados");

		System.out.print("Nome: ");
		f.nome = sc.next();
		System.out.print("Salario Bruto: ");
		f.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		f.taxa = sc.nextDouble();
		f.salarioLiquido();
		System.out.printf("Funcionario: %s, $ %.2f", f.nome, f.salarioLiquido());
		
		System.out.println();
		System.out.print("Informe o percentual de almento: ");
		double percentual = sc.nextDouble();
		f.novoSalario(percentual);
		System.out.printf("Funcionario: %s, $ %.2f", f.nome, f.novoSalario(percentual));
		
		
		

		sc.close();

	}

}
