package academy.devdojo.logicprog.exercicios;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        /*
        Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e senha corretos devem estar armazenados em constantes no seu programa. Se o usuário acertar o usuário e a senha exibir a mensagem ACESSO CONCEDIDO, caso contrário exibir a mensagem `   ACESSO NEGADO e voltar a pedir o usuário e senha, essa condição deve-se repetir até que o usuário acerte a combinação.
         */

        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        boolean exibirTelaLogin = true;

        Scanner scanner = new Scanner(System.in);


        while (exibirTelaLogin){
            System.out.print("Digite o Login: ");
            String userLogin = scanner.nextLine();

            System.out.print("Digite sua Senha: ");
            String userPassword = scanner.nextLine();

            if (login.equals(userLogin) && password.equals(userPassword)){
                System.out.println("ACESSO CONCEDIDO");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("ACESO NEGADO");
        }
        System.out.println("Programa Terminado         ");
        scanner.close();
    }
}
