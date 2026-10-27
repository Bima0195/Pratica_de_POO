package exercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

public class PersonDAOTest {
    private final PersonDAO dao = new PersonDAO();

    private Person pessoaValida() {
        Person person = new Person("Maria Silva", 20);
        person.getEmails().add(new Email("maria@exemplo.com"));
        return person;
    }

    @Test
    void pessoaValidaNaoTemErros() {
        assertTrue(dao.isValidToInclude(pessoaValida()).isEmpty());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ana", "Ana 123", "Ana Silva!", "   "})
    @NullAndEmptySource
    void nomeInvalido(String nome) {
        Person person = new Person(nome, 20);
        person.getEmails().add(new Email("a@b.c"));
        assertEquals(1, dao.isValidToInclude(person).size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ana Maria", "João José", "  Ana   Silva  "})
    void nomeValido(String nome) {
        Person person = new Person(nome, 20);
        person.getEmails().add(new Email("a@b.c"));
        assertTrue(dao.isValidToInclude(person).isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 201})
    void idadeInvalida(int idade) {
        Person person = new Person("Maria Silva", idade);
        person.getEmails().add(new Email("a@b.c"));
        assertEquals(1, dao.isValidToInclude(person).size());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 200})
    void limitesDeIdadeValidos(int idade) {
        Person person = new Person("Maria Silva", idade);
        person.getEmails().add(new Email("a@b.c"));
        assertTrue(dao.isValidToInclude(person).isEmpty());
    }

    @Test
    void semEmail() {
        assertEquals(1, dao.isValidToInclude(new Person("Maria Silva", 20)).size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc", "@b.c", "a@.c", "a@b.", "a@@b.c", "a b@c.d"})
    @NullAndEmptySource
    void emailInvalido(String nome) {
        Person person = pessoaValida();
        person.getEmails().clear();
        person.getEmails().add(new Email(nome));
        assertEquals(1, dao.isValidToInclude(person).size());
    }

    @Test
    void validaTodosOsEmails() {
        Person person = pessoaValida();
        person.getEmails().add(new Email("invalido"));
        assertEquals(1, dao.isValidToInclude(person).size());
    }

    @Test
    void emailNulo() {
        Person person = pessoaValida();
        person.getEmails().add(null);
        assertEquals(1, dao.isValidToInclude(person).size());
    }

    @Test
    void acumulaErros() {
        assertEquals(3, dao.isValidToInclude(new Person("Ana", 0)).size());
    }

    @Test
    void pessoaNula() {
        assertEquals(1, dao.isValidToInclude(null).size());
    }
}

