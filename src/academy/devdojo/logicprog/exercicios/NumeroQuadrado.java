package academy.devdojo.logicprog.exercicios;

public class NumeroQuadrado {
    //Elaborar um programa que apresente os quadrados dos números inteiros existentes na faixa de valores de 15 até 200.

    public static void main(String[] args) {
        int numraiz;
        for (int i = 1; i < 200; i++) {
            numraiz = i * i;
            if (numraiz >= 15 && numraiz <= 200){
                System.out.println(numraiz);
            }
        }
    }
}
