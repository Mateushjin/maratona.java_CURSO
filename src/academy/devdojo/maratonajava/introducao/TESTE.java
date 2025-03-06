package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class TESTE {
    public static void main(String[] args) {
        String[] nomesAntigos = {"Ana", "Bruno", "Carlos"};

        // Criando um novo array maior
        String[] nomesNovos = new String[5];

        // Copiando os valores antigos manualmente
        for (int i = 0; i < nomesAntigos.length; i++) {
            nomesNovos[i] = nomesAntigos[i];
        }

        // Adicionando novos valores
        nomesNovos[3] = "Daniela";
        nomesNovos[4] = "Eduardo";

        // Atualizando a referência para o novo array
        nomesAntigos = nomesNovos;

        // Exibindo os valores
        for (String nome : nomesAntigos) {
            System.out.println(nome);
        }
    }
}

