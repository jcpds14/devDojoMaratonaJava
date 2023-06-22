package academy.devdojo.maratonajava.javacore.Aintroclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "HONDA";
        carro1.modelo = "FIT";
        carro1.ano = 2008;

        carro2.nome = "HYUNDAI";
        carro2.modelo = "HB20S";
        carro2.ano = 2016;

        System.out.printf("Carro: %s Modelo: %s Ano: %d\n", carro1.nome, carro1.modelo, carro1.ano);
        System.out.printf("Carro: %s Modelo: %s Ano: %d\n", carro2.nome, carro2.modelo, carro2.ano);
    }
}