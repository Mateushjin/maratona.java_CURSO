package academy.devdojo.logicprog.exercicios;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 6500;
        double resultado;

        if (salario < 1903.98){
            System.out.println("Você está isento de imposto de renda");
        }else if (salario >= 1903.99 && salario <= 2826.65){
            resultado = salario * 0.075;
            System.out.println(resultado);
        }else if(salario >= 2826.66 && salario <= 3751.05){
            resultado = salario * 0.15;
        }else if (salario <= 3751.06 && salario >= 4664.68){
            resultado = salario * 0.225;
            System.out.println(resultado);
        }else {
            resultado = salario * 0.275;
            System.out.println(resultado);
        }
    }
}
