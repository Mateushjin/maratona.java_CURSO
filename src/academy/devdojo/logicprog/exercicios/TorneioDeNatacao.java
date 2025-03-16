package academy.devdojo.logicprog.exercicios;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        /* Eu como usuaario gostaria de ter o nome e a idade de participantes de um torneio de natacao e que o sistema imprimisse da seguinte forma:
        Menor que 10 anos: <Nome> participará da categoria Infantil.
        Entre 11 a 15 anos: <Nome> participará da categoria Juvenil.
        Entre 16 a 19 anos: <Nome> participará da categoria Pré-Adulto.
        Acima de 20 anos: <Nome> participará da categoria Adulto.
        Para que eu possa rapidamento classificar todos os participantes
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digira a idade: ");
        int idade = scanner.nextInt();

        if (idade < 10){
            System.out.println(nome + " participará da categoria Infantil.");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil.");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-Adulto");
        }else {
            System.out.println(nome + " participará da categoria Adulto");
        }
    }
}
