package academy.devdojo.logicprog.exercicios;

public class CalculadoraImpostoComCondicao {
    public static void main(String[] args) {
        // dado um determinado salario se o salario for maior que 4500 imprima 30% do valor se nao impprima 15% do valor
        // Utilize apenas uma variavel para guardar o resultado e imprimir no final

        double salario = 4900;
        double resultado;

        if (salario >= 4500){
            resultado = salario * 0.3;
            System.out.println(resultado);
        }else {
            resultado = salario * 0.15;
            System.out.println(resultado);
        }
    }
}
