package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoComprar = idade >= 18;

        if (isAutorizadoComprar){
            System.out.println("Autorizado a comprar bebida");
        }else {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
    }
}
