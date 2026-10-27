package exercicio3;

public class CalculadoraSalario {
    public double calcular(Funcionario funcionario) {
        double salario = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();

        if (cargo == Cargo.DESENVOLVEDOR) {
            return salario >= 3000 ? salario * 0.80 : salario * 0.90;
        }
        if (cargo == Cargo.DBA || cargo == Cargo.TESTADOR) {
            return salario >= 2000 ? salario * 0.75 : salario * 0.85;
        }
        if (cargo == Cargo.GERENTE) {
            return salario >= 5000 ? salario * 0.70 : salario * 0.80;
        }
        throw new IllegalArgumentException("Cargo invalido.");
    }
}

