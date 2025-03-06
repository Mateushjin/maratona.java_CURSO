package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao05 {
    public static void main(String[] args) {
        double valotTotal = 30000;
        for (int parcela = (int) valotTotal; parcela >= 1; parcela--) {
            double valorParcela = valotTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.printf("%d parcela de R$%.2f\n", parcela, valorParcela);
        }

    }
}
