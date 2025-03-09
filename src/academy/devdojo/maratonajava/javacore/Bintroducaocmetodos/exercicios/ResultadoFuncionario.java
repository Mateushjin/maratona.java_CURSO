package academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.exercicios;

public class ResultadoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Mateus";
        funcionario.idade = 23;
        funcionario.salarios = new double[] {2100, 970, 1760};

        funcionario.imprime();

    }
}
