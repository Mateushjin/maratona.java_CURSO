package academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // pessoa.nome = "Mateus";
        pessoa.setNome("Mateus");
        pessoa.setIdade(23);

        //pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
