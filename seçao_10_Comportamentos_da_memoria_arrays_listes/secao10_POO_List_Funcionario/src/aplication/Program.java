/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.
(exemplo na próxima página)*/

package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcionários serão registrados? ");
		int N = sc.nextInt();

		List<Funcionario> list = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Funcionário #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();

			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Salario: ");
			double salario = sc.nextDouble();

			list.add(new Funcionario(id, nome, salario));

		}

		Funcionario funci = null;
		// busca pelo id
		System.out.print("Insira o ID do funcionário que receberá o aumento salarial: ");
		int buscarid = sc.nextInt();

		for (Funcionario f : list) {
			if (f.getId() == buscarid) {
				funci = f;
				break;
			}
		}

		if (funci == null) {
			System.out.println("Funcionario não encontrado");
		} else {
			System.out.print("Insira a porcentagem: ");
			double percentual = sc.nextDouble();
			funci.aumentarSalario(percentual);
		}
		
		System.out.println("Lista de funcionários:");

		for (Funcionario Funcionario : list) {
			System.out.println(Funcionario);

		}

		sc.close();
	}

}
