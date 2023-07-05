package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro { //Classe final não pode ser extendida, String é uma classe final
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){//Métodos finais não podem ser sobrescritos
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}