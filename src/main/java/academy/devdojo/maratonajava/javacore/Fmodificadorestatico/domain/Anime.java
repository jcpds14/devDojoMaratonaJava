package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    //0 - Bloco de innicalização é executado quando a JVM carregar a classe
    //1 - É alocado espaço em memória pro objeto
    //2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3 - O bloco de inicialização é executado
    //4 - Construtor é executado
    //Blocos de inialização estáticos são inicados primeiromente no código e apenas uma vez cada, blocos de
    // inicialização não estáticos são executados todas as vezes que o objeto é chamado.
    private String nome;
    private static int[] episodios;

    {
        System.out.println("Dentro do bloco de inicialização não estático");
        episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("Dentro do bloco estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios)
            System.out.print(episodio + " ");
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}