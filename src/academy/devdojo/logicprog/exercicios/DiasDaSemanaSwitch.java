package academy.devdojo.logicprog.exercicios;

public class DiasDaSemanaSwitch {
    public static void main(String[] args) {
        int diaDaSemana = 1;

        switch (diaDaSemana){
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia Inválido");
        }
    }
}
