package academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.exercicios;

public class ResultadoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Mateus");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[] {1770, 1890, 1900});

        funcionario.imprime();

    }
}
