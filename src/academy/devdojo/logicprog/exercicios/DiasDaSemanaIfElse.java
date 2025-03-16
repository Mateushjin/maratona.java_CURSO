package academy.devdojo.logicprog.exercicios;

import java.util.Scanner;

public class DiasDaSemanaIfElse {
    // Receba um número inteiro do usuário e imprima o dia da semana correspondente
    // Sendo 1 = segunda-feira.
    // IF/ELSE
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero correspondente ao dia da Semana: ");
        int diaDaSemana = scanner.nextInt();

        if (diaDaSemana == 1){
            System.out.println("Segunda-feira");
        }else if (diaDaSemana == 2){
            System.out.println("Terça-feira");
        } else if (diaDaSemana == 3) {
            System.out.println("Quarta-feira");
        } else if (diaDaSemana == 4) {
            System.out.println("Quinta-feira");
        } else if (diaDaSemana == 5) {
            System.out.println("Sexta-feira");
        } else if (diaDaSemana == 6) {
            System.out.println("Sábado");
        } else if (diaDaSemana == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Dia Inválido");
        }
    }
}
