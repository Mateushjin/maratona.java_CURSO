package academy.devdojo.logicprog.exercicios;

import java.util.Scanner;

public class MenuDeNavegacao {
    public static void main(String[] args) {
        /*
        Como usuarios eu gostaria de ter um menu visual que seja navegavel atravez de numeros.
        O menu deve ser exibido da seguinte forma:

        1. Calcular Imposto.
        2. Depositar Salário.
        3. Sair.

        O menu deve ficar disponível enquanto eu não digitar o número 3.
        Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação;
         */
        Scanner scanner = new Scanner(System.in);

        int nav = 0;

        while (nav !=  3){

            System.out.println("===========================");
            System.out.println("Menu");
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            nav = scanner.nextInt();

            if (nav == 1){
                System.out.println("Calcular Imposto ");
            }else if (nav == 2){
                System.out.println("Depositar Salário");
            }else if (nav == 3){
                System.out.println("Volte Sempre");
            }else {
                System.out.println("Opção Inválido");
            }
        }
    }
}
