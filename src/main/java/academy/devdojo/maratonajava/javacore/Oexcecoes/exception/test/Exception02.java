package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class Exception02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivos\\teste2.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado com sucesso: " + file.getPath());
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}