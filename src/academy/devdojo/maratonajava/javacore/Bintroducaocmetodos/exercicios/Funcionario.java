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

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

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
        if (salarios != null)

        for (double salario : salarios){
            media += salario;
        }

        media /= salarios.length;

        System.out.printf("\nMedia de Salario é R$%.2f", media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
