package academy.devdojo.maratonajava.introducao;
public class Aula07Array02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Saitama";
        nomes[2] = "Orochi";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}