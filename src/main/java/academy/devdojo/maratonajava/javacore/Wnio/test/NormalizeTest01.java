package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/jean/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path pt1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(pt1);
        System.out.println(pt1.normalize());
    }
}