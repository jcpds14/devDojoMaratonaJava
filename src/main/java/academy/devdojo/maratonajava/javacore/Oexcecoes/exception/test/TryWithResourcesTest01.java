package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }


    public static void lerArquivo(){
        //Try with resources deve ser usado apenas se o objeto implementa a interface AutoCloseable
        //O java executa o close, fazendo que eu não precise me preocupar em lançar o close.
        //E é executado de forma inversa.
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2();){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}