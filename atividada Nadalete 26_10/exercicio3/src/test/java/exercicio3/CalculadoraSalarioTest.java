package exercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraSalarioTest {
    private final CalculadoraSalario calculadora = new CalculadoraSalario();

    @ParameterizedTest
    @CsvSource({
        "DESENVOLVEDOR, 2999, 2699.10",
        "DESENVOLVEDOR, 3000, 2400",
        "DESENVOLVEDOR, 4000, 3200",
        "DBA, 1999, 1699.15",
        "DBA, 2000, 1500",
        "DBA, 3000, 2250",
        "TESTADOR, 1999, 1699.15",
        "TESTADOR, 2000, 1500",
        "TESTADOR, 3000, 2250",
        "GERENTE, 4999, 3999.20",
        "GERENTE, 5000, 3500",
        "GERENTE, 6000, 4200"
    })
    void calculaSalario(Cargo cargo, double base, double esperado) {
        Funcionario funcionario = new Funcionario("Ana Silva", "ana@exemplo.com", base, cargo);
        assertEquals(esperado, calculadora.calcular(funcionario), 0.001);
    }

    @Test
    void guardaDadosDoFuncionario() {
        Funcionario funcionario = new Funcionario("Ana Silva", "ana@exemplo.com", 3000, Cargo.DBA);
        assertEquals("Ana Silva", funcionario.getNome());
        assertEquals("ana@exemplo.com", funcionario.getEmail());
        assertEquals(3000, funcionario.getSalarioBase());
        assertEquals(Cargo.DBA, funcionario.getCargo());
    }

    @Test
    void cargoNulo() {
        Funcionario funcionario = new Funcionario("Ana Silva", "ana@exemplo.com", 3000, null);
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcular(funcionario));
    }
}

