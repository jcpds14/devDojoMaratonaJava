package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Seminario;

public class ExTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Castro Alves");
        Aluno aluno = new Aluno("Jean", 25);
        Professor professor = new Professor("Willliam Suane", "Java");

        Aluno[] alunosParaOSeminario = {};

        Seminario seminario = new Seminario("Maratona Java", local, alunosParaOSeminario);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}