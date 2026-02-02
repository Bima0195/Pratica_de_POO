package main;

import java.util.Locale;
import java.util.Scanner;

import entitie.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto p = new Produto();
		
		
		p.nome = sc.next();
		p.preco = sc.nextDouble();
		p.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto:" + p);
		
		System.out.println( );
		
		System.out.print("Insira a quantidade de produtos a serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		p.addProdutos(quantidade);
		
		System.out.println("Dados atualizados: " + p);
		
		System.out.println( );
		
		System.out.print("Insira a quantidade de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		p.removerProduto(quantidade);
		System.out.println("Dados atualizados: " + p);
		
		
	

		
	 sc.close();
	}

}
