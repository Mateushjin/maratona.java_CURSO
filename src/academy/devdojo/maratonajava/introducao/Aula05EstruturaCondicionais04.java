package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais04 {
    public static void main(String[] args) {
        double salario = 50000;

        if (salario > 0 && salario <= 34712){
            System.out.println("Voce vai pagar uma taxa de 9.70%");
        }else if (salario >= 34713 && salario <= 68507){
            System.out.println("Voce vai pagar uma taxa de 37.35%");
        }else {
            System.out.println("Voce vai pagar uma taxa de 49.50%");
        }
    }
}
