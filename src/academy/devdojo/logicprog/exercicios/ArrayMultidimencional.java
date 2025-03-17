package academy.devdojo.logicprog.exercicios;

public class ArrayMultidimencional {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][2];
        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 11;
        arrayMulti[1][0] = 44;
        arrayMulti[1][1] = 55;

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti.length; j++) {
                System.out.println(arrayMulti[i][j]);
            }
        }
    }

}
