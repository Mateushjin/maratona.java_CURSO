package academy.devdojo.logicprog.exercicios;

import java.util.Scanner;

public class numeroImpares {
    /*
    Eu como usuario gostaria de imprimir todos os numeros impares de 0 ate o valores digitado pelo usuario
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor desejado: ");
        int num = scanner.nextInt();
        int inicial = 0;

        while(inicial <= num){
            if (inicial % 2 == 1){
                System.out.println(inicial);
            }
            inicial ++;
        }
    }
}
