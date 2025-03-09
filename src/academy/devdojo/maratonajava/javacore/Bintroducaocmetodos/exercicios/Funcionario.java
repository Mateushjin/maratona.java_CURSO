package academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.exercicios;

public class Funcionario {
    // Crie uma classe Funcionario com os seguintes atributos

    /*
    nome
    idade
    salario // três salários devem ser guardados

    Crie dois métodos

    1. Para imprimir os dados
    2. Para tirar a média dos salários e imprimir o resultado.
     */

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null)
        for (double salario : salarios){
            System.out.print(salario + " ");
        }
        mediaSalario();
    }

    public void mediaSalario(){
        double media = 0;
        if (salarios != null)
        for (double salario : salarios){
            media += salario;
        }

        media /= salarios.length;

        System.out.printf("\nMedia de Salario é R$%.2f", media);
    }

}
