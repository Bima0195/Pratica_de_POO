/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

package exercicio08;

import java.util.Scanner;

public class Media_Par {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?: ");
		int N = sc.nextInt();
		int[] vet = new int[N];
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		int soma = 0;
		int contPar = 0;
		for(int i=0; i<vet.length; i++) {
			if(vet[i] % 2 ==0) {
				soma += vet[i];
				contPar++;
			}
					
		}
		
		if(contPar == 0) {
				System.out.println("Nenhum numero Par");
		}
		else {
		double media = (double) soma /contPar;
		System.out.println("Media dos pares = " + media);
		}
		
		sc.close();

	}

}
