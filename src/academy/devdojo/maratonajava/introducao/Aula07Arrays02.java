package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double = 0
        // char = '\u0000'
        // boolean = false;
        // String e resto dos padrões reference = null

        String[] nomes = new String[3];
        nomes[0] = "Luffy";
        nomes[1] = "Zoro";
        nomes[2] = "Sanji";
        nomes[3] = "Nami";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
