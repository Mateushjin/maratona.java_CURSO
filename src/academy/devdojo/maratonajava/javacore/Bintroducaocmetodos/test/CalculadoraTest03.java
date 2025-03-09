package academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.divideDoisNumeros(20, 0));
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("------------------------");
        calculadora.imprimiDivisaoDeDoisNumeros(86, 9);
    }
}
