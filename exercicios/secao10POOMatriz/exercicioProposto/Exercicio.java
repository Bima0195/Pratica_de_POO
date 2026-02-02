/*34
Exercício de fixação
http://educandoweb.com.br
Prof. Dr. Nelio Alves
Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.*/

package exercicioProposto;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição: " + i + "," + j);
					System.out.println("Esquerda: " + mat[i][j - 1]);

					if (j < mat.length) {
						System.out.println("Direita: " + mat[i][j + 1]);

					}

					if (i - 1 < 0) {

					} else {
						System.out.println("Cima: " + mat[i - 1][j]);
					}

					System.out.println("Baixo: " + mat[i + 1][j]);

				}

			}
		}

		sc.close();
	}

}
