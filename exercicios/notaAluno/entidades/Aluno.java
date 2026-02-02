package entidades;

public class Aluno {

	public String nome;
	public double notaA;
	public double notaB;
	public double notaC;

	public void mediaFinal() {

		if (notaA <= 100.00 && notaB <= 100.00 && notaC <= 100.00) {
			double media = notaA + notaB + notaC;
			System.out.printf("Media fina: %.2f%n", media);

			if (media > 60) {
				System.out.println("Aprovado");

			} else if (media < 60) {
				System.out.println("Reprovado");

				double falta = 60 - media;
				System.out.printf("Falta %.2f, para atingir a média.", falta);

			}

		} else {
			System.out.println("Nota invalida");
		}
	}

}
