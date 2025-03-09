package academy.devdojo.maratonajava.javacore.Bintroducaocmetodos.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println(estudante.nome + " " + estudante.idade + " " + estudante.sexo);
    }
}
