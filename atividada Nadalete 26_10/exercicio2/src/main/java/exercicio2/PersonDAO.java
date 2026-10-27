package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    public List<String> isValidToInclude(Person person) {
        List<String> erros = new ArrayList<>();

        if (person == null) {
            erros.add("Pessoa obrigatoria.");
            return erros;
        }
        if (person.getNome() == null ||
                !person.getNome().trim().matches("\\p{L}+(\\s+\\p{L}+)+")) {
            erros.add("Nome deve ter pelo menos duas partes, somente com letras.");
        }
        if (person.getIdade() < 1 || person.getIdade() > 200) {
            erros.add("Idade deve estar entre 1 e 200.");
        }
        if (person.getEmails().isEmpty()) {
            erros.add("Informe pelo menos um email.");
        }
        for (Email email : person.getEmails()) {
            if (email == null || email.getNome() == null ||
                    !email.getNome().matches("[^@\\s.]+(?:\\.[^@\\s.]+)*@[^@\\s.]+(?:\\.[^@\\s.]+)+")) {
                erros.add("Email invalido.");
            }
        }
        return erros;
    }
}

