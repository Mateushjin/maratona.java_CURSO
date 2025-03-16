package academy.devdojo.logicprog.exercicios;

public class CalculadoraSalario02 {
    public static void main(String[] args) {
        // Crie um variável que irá guardar o valor de um salário
        // Calcule a porcentagem desse salario, sendo os valores da porcentagem serao:
        // 30%
        // 15%
        // 5%
        // A cada vez que calcularar guarde o resultado em uma variavel imprima o resultado e reutilize a variavel que guarda o resultado para o novo calculo

        double salario = 3000;

        double resultado = salario * 0.3;

        System.out.println(resultado);
        resultado = salario * 0.15;
        System.out.println("Resultado de 15%: " + resultado);
        resultado = salario * 0.05;
        System.out.println("Resulrado de 5%: " + resultado);

    }
}
