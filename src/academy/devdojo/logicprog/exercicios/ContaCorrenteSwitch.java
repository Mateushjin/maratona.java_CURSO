package academy.devdojo.logicprog.exercicios;

import java.util.Scanner;

public class ContaCorrenteSwitch {
    public static void main(String[] args) {
        /*
        Como gerente eu gostaria que meus usuarios pudessem digitar o tipo da conta e o sistema imprima qual a porcentagem de juros que aquela conta irá oferecer. Com o intuito de agilizar o acesso as informações:

        Os tipos de dados são:
        CONTA_POUPANCA: 0.05%
        CONTA_CORRENTE O.O2%
        CONTA_INVESTIMENTO 0.1%
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Conta Poupança: 0.05%");
        System.out.println("2 - Conta Corrente: 0.02%");
        System.out.println("3 - Conta de Investimento: 0.1%");
        System.out.print("Digite o numero de acordo com a conta que quer abrir: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Conta Poupança: 0.05%");
                break;
            case 2:
                System.out.println("Conta Corrente: 0.02%");
                break;
            case 3:
                System.out.println("Conta de Investimento: 0.1%");
                break;
            default:
                System.out.println("Conta Inexistente");
        }
    }
}
