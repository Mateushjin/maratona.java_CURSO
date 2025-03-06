package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um carro descubra em quantas vezes ele pode ser parcelado.
        // COndição valorParcela >= 1000;

        double valotTotal = 10000;
        for (int parcela = 1; parcela < valotTotal; parcela++) {
            double valorParcela = valotTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.printf("%d parcela de R$%.2f\n", parcela, valorParcela);
        }

    }
}