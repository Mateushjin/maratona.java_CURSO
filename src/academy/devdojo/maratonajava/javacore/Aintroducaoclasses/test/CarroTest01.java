package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca bala";
        carro1.ano = 1969;
        carro1.modelo = "Sport";

        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 1968;

        carro1 = carro2;

        System.out.println(carro1.nome + carro1.modelo + carro1.ano);

        System.out.println(carro2.nome + carro2.modelo + carro2.ano);
    }
}
