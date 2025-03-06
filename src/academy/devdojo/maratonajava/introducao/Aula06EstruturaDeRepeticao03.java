package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiro 25 nnumero de um dado valor. Por Exemplo: 50

        int valroMaximo = 50;

        for (int i = 0; i < valroMaximo; i++){
            System.out.println(i);
            if (i == 25){
               break;
            }
        }
    }
}
