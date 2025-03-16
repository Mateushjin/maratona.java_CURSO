package academy.devdojo.logicprog.exercicios;

import java.util.Scanner;
/*
Eu, como adiministrador do sistema, gostaria de permitir que os próprios usuários cadastrassem o nome de usuários (login) no sistem para agilizar o processo de migração do sistema antigo para o novo.

O usuario nao pode deixar o login vazio "', ou criar um usuario com o login "admin" ou "administrador".
Se o valor entrada for válido, o sistema devera exibir uma mensagem <nome do usaurio> cadastrado com sucesso. Senão o sistema deverá mostrar o erro "Usuário inválido"
 */
public class CadastroLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        if (nome.isBlank() || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuário Inválido");
        }else {
            System.out.println(nome + " cadastrado com sucesso.");
        }
    }
}
