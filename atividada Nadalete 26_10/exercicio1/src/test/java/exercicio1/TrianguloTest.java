package exercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TrianguloTest {
    private final Triangulo triangulo = new Triangulo();

    @Test
    void escalenoValido() {
        assertEquals("Escaleno", triangulo.classificar(3, 4, 5));
    }

    @Test
    void equilateroValido() {
        assertEquals("Equilatero", triangulo.classificar(5, 5, 5));
    }

    @ParameterizedTest
    @CsvSource({"5,5,3", "5,3,5", "3,5,5"})
    void isoscelesValido(int a, int b, int c) {
        assertEquals("Isosceles", triangulo.classificar(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"0,4,5", "4,0,5", "4,5,0", "-1,4,5", "4,-1,5", "4,5,-1", "0,0,0"})
    void ladosNaoPositivos(int a, int b, int c) {
        assertEquals("Invalido", triangulo.classificar(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"2,3,5", "2,5,3", "3,2,5", "3,5,2", "5,2,3", "5,3,2"})
    void somaIgualAoTerceiro(int a, int b, int c) {
        assertEquals("Invalido", triangulo.classificar(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"1,2,5", "1,5,2", "2,1,5", "2,5,1", "5,1,2", "5,2,1"})
    void somaMenorQueTerceiro(int a, int b, int c) {
        assertEquals("Invalido", triangulo.classificar(a, b, c));
    }
}

