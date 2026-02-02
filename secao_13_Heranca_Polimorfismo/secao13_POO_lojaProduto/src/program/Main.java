/*Fazer um programa para ler os dados de N
produtos (N fornecido pelo usuário). Ao final,
mostrar a etiqueta de preço de cada produto na
mesma ordem em que foram digitados.
Todo produto possui nome e preço. Produtos
importados possuem uma taxa de alfândega, e
produtos usados possuem data de fabricação.
Estes dados específicos devem ser
acrescentados na etiqueta de preço conforme
exemplo (próxima página). Para produtos
importados, a taxa e alfândega deve ser
acrescentada ao preço final do produto.
Favor implementar o programa conforme
projeto ao lado.*/

package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ProdutoImportado proImp = new ProdutoImportado();
		
		List<Produto> list = new ArrayList<>();
		
		
		System.out.print("Insira o número de produtos: ");
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			    System.out.println("Datos do produto #" + i + ":");
				System.out.print("Comum, usado ou importado (c/u/i)? ");
				char ch = sc.next().charAt(0);
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preço: ");
				double preco = sc.nextDouble();
				
				if(ch == 'c') {
					list.add(new Produto(nome, preco));
				}
				
				else if(ch == 'i') {
					System.out.print("Taxa de importação: ");
					double taxaImpor = sc.nextDouble();
							
					list.add(new ProdutoImportado(nome, preco, taxaImpor));
				}
				else if(ch == 'u') {
					System.out.print("Data de fabricação (DD/MM/YYYY): ");
					
					LocalDate dataFabri = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					
					list.add(new ProdutoUsado(nome, preco, dataFabri));
				}
		}
		
		System.out.println();
		
		System.out.println("ETIQUETAS DE PRECO:");
		for(Produto pro: list) {
		System.out.println(pro.precoTag());
		}
		
		sc.close();
	}
	

}
