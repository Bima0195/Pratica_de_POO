package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.next();
		aluno.notaA = sc.nextDouble();
		aluno.notaB = sc.nextDouble();
		aluno.notaC = sc.nextDouble();
		
		 
		aluno.mediaFinal();

		
		sc.close();
	}

}
