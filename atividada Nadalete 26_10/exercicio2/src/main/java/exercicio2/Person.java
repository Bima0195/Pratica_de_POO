package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String nome;
    private int idade;
    private List<Email> emails = new ArrayList<>();

    public Person(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<Email> getEmails() {
        return emails;
    }
}

