package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(190);
        Carro c1 = new Carro("BMW", 279);
        Carro c2 = new Carro("Mercedes Benz", 275);
        Carro c3 = new Carro("AUDI", 300);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}