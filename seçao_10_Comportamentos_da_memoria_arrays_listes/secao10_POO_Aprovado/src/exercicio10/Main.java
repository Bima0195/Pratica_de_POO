/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).*/

package exercicio10;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int N = sc.nextInt();
		Aluno[] vetAluno = new Aluno[N];

		for (int i = 0; i < vetAluno.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: %n", i + 1);
			String nome = sc.next();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vetAluno[i] = new Aluno(nome, nota1, nota2);

		}

	
		
		/*for (int i = 0; i < vetAluno.length; i++) {		
			double media = vetAluno[i].getNota1() + vetAluno[i].getNota2() / 2;
			if (media > 6) {
				System.out.println(vetAluno[i].getNome());
			}
		}*/
		
		for(Aluno aluno : vetAluno) {
			if(aluno.calcularMedia() > 6) {
				System.out.println(aluno.getNome());
			}
		}

		sc.close();
	}

}
