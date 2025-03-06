package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se e dia útil ou final de semana.
        // Condiserando 1 como domingo

        byte dia = 2;
        switch (dia){
            case 1,7:
                System.out.println("Final de Semanas");
                break;
            case 2, 3, 4, 5, 6:
                 System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Dia Inválida");
                break;
        }
    }
}
