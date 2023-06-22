package academy.devdojo.maratonajava.javacore.Bintrometodos.test;

import academy.devdojo.maratonajava.javacore.Bintrometodos.domain.EstudanteMetodos;
import academy.devdojo.maratonajava.javacore.Bintrometodos.domain.ImpressoraEstudanteMetodos;

public class EstudanteTest01 {
    public static void main(String[] args) {
        EstudanteMetodos estudanteMetodos1 = new EstudanteMetodos();
        EstudanteMetodos estudanteMetodos2 = new EstudanteMetodos();
        ImpressoraEstudanteMetodos impressoraEstudanteMetodos = new ImpressoraEstudanteMetodos();

        estudanteMetodos1.nome = "Midoriya";
        estudanteMetodos1.idade = 15;
        estudanteMetodos1.sexo = 'M';

        estudanteMetodos2.nome = "Sakura";
        estudanteMetodos2.idade = 16;
        estudanteMetodos2.sexo = 'F';

        impressoraEstudanteMetodos.imprime(estudanteMetodos1);
        impressoraEstudanteMetodos.imprime(estudanteMetodos2);
    }
}