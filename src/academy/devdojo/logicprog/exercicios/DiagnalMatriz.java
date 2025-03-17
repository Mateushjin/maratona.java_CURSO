package academy.devdojo.logicprog.exercicios;

public class DiagnalMatriz {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[3][3];
        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 11;
        arrayMulti[0][2] = 4;
        arrayMulti[1][0] = 44;
        arrayMulti[1][1] = 55;
        arrayMulti[1][2] = 9;
        arrayMulti[2][0] = 2;
        arrayMulti[2][1] = 5;
        arrayMulti[2][2] = 21;

        int resultadoMultiplicacaoDiagonalPrincipal = 1;

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                if (i==j){
                    resultadoMultiplicacaoDiagonalPrincipal = resultadoMultiplicacaoDiagonalPrincipal * arrayMulti[i][j];
                }
            }
        }

        System.out.println(resultadoMultiplicacaoDiagonalPrincipal);
    }
}

