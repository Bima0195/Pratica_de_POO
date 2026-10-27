package exercicio1;

public class Triangulo {
    public String classificar(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Invalido";
        }
        if ((long) a + b <= c || (long) a + c <= b || (long) b + c <= a) {
            return "Invalido";
        }
        if (a == b && b == c) {
            return "Equilatero";
        }
        if (a == b || a == c || b == c) {
            return "Isosceles";
        }
        return "Escaleno";
    }
}

