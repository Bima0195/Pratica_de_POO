package program;

import java.util.ArrayList;
import java.util.List;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		
		List<Conta> list = new ArrayList<>();
		
		list.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
		list.add(new ContaEmpresa(1002, "Bima", 1000.00, 300.00));
		list.add(new ContaPoupanca(1003, "João", 700.00, 0.01));
		list.add(new ContaEmpresa(1004, "Zé", 1200.00, 500.00));
		
		double soma = 0.00;
		for(Conta cont: list) {
			soma += cont.getSaldo();
		}
		
		System.out.printf("Total de saldos: %.2f%n", soma);
		
		for(Conta cont: list) {
			cont.deposito(10.00);;
		}
		
		for(Conta cont: list) {
			System.out.println(cont.getSaldo());
		}
	}

}
