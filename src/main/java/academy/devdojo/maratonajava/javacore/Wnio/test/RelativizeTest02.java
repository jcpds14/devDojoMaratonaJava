package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest02 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/jean");
        Path clazz = Paths.get("/home/jean/devdojotop/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);
    }
}