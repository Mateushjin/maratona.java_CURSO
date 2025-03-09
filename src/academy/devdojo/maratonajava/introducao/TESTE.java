package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class TESTE {
    public static void main(String[] args) {
        int[][] irregular = new int[3][];
        irregular[0] = new int[]{1, 2, 3};       // Linha 0 tem 3 colunas
        irregular[1] = new int[]{4, 5};          // Linha 1 tem 2 colunas
        irregular[2] = new int[]{6, 7, 8, 9};    // Linha 2 tem 4 colunas

        for (int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                System.out.print(irregular[i][j] + " ");
            }
            System.out.println();
        }
    }
}

