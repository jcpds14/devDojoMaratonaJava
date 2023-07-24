package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.domain.Turma;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Jean", "123");
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");

        try (ObjectOutputStream ois = new ObjectOutputStream(Files.newOutputStream(path))) {
            ois.writeObject(aluno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}