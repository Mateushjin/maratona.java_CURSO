package academy.devdojo.logicprog.exercicios;

public class ImparOuPar {
    // dado um determinado numero inteiro imprima se ele e impar ou par

    public static void main(String[] args) {
        int numero = 54;

        if (numero % 2 == 0){
            System.out.println(numero + " é par");
        }else {
            System.out.println(numero + " é impar");
        }
    }
}
