package academy.devdojo.logicprog.exercicios;

import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("O nome digitado foi: " + nome);
    }
}
