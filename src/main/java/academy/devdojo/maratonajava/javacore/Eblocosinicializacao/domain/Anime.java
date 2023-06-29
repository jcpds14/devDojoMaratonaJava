package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    //1 - É alocado espaço em memória pro objeto
    //2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3 - O bloco de inicialização é executado
    //4 - Construtor é executado
    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            episodios[i] = i+1;
        }
        for (int episodio : episodios)
            System.out.print(episodio + " ");
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