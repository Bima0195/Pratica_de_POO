package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Bima"); // Adicionar elemento em alguma posição.
		list.add("Abimael");
		list.add("Acsa");

		System.out.println(list.size()); // imprimi o tamanho da lista.
		for (String teste : list) {
			System.out.println(teste);
		}
		System.out.println("----------------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); // remove por um predicado. Todos que começam com a letra M sera
												// removido.

		for (String teste : list) {
			System.out.println(teste);

		}

		System.out.println("----------------------------");
		list.remove(2); // remove pela posição.

		for (String teste : list) {
			System.out.println(teste);
		}

		System.out.println("----------------------------");
		list.remove("Alex"); // remove a palavra.

		for (String teste : list) {
			System.out.println(teste);
		}

		System.out.println("----------------------------");
		System.out.println("Index of Bima: " + list.indexOf("Bima")); // tras a posição do elemento.
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // Quando o elemento não é encontrado, o sistema
																		// imprimi -1.

		System.out.println("----------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Deixa na
																											// lista
																											// todos os
																											// elementos
																											// que
																											// começam
																											// com
																											// parametro
																											// informado.
																											// Nesse
																											// caso "A".

		for (String teste : result) {
			System.out.println(teste);
		}
		System.out.println("----------------------------");
		// Encotrar o primeiro elemento que atenda o parametro.

		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);

	}

}
