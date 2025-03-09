package academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");

        calculadora.subtrairDoisNumeros();
    }
}
