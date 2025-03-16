package academy.devdojo.logicprog.exercicios;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        // Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros para que eu passo agilizar o processo de cadastramento:
        //sexo, sendo válido apenas M ou F e idade:
        /*
        Se o sexo for Masculino e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório.
        Se o sexod for Masculino e a idade for menor que 18 o sistema deve imprirmir, alistamento não permitido.
        Se o sexo for Feminino e a idade for maior igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
        Se o sexo for Feminino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu sexo(M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digita sua idade: ");
        int idade = scanner.nextInt();

        if ((sexo == 'M' || sexo == 'F') && idade < 18){
            System.out.println("Alistamento Não Permitido");
        }else if (idade >= 18 && sexo == 'M'){
            System.out.println("Alistamento Obrigatório");
        }else if (idade >= 18 && sexo == 'F'){
            System.out.print("Você gostaria de alistar? (S/N)");
            char confirmacao = scanner.next().charAt(0);
        }
    }
}
