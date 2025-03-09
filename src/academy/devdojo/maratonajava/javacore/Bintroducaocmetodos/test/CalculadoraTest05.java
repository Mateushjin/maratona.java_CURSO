package academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somarVarArgs(1, 2, 4, 5, 6, 7, 8, 9, 10);
    }
}
