/*Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.
Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
seguintes:
Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
destes gastos são abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00*/

package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Insira o número de contribuintes: ");
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.println("Dados do contribuinte nº"+i+": ");
			System.out.print("Pessoa física ou jurídica(f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome= sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(ch == 'f') {
				System.out.print("Gastos com saude: ");
				double saude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, saude));
			}
			else if(ch == 'j') {
			     System.out.print("Quantidade de funcionarios: ");
			     int funcionario = sc.nextInt();
			     
			     list.add(new PessoaJuridica(nome, rendaAnual, funcionario));
				
			}
			
		}
		
		double soma =0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		for(Pessoa p: list) {
			System.out.println(p.paid());
			 soma += p.imposto();
		}
		
		System.out.println();
		System.out.println("Total de impostos: $" + soma);	
		
		sc.close();

	}

}
