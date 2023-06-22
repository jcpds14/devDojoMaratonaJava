package academy.devdojo.maratonajava.javacore.Bintrometodos.domain;

public class ImpressoraEstudanteMetodos {
    public void imprime(EstudanteMetodos estudanteMetodos){
        System.out.println("-------------------------");

        System.out.println(estudanteMetodos.nome);
        System.out.println(estudanteMetodos.idade);
        if (estudanteMetodos.sexo == 'M'){
            System.out.println("Masculino");
        }else if (estudanteMetodos.sexo == 'F'){
            System.out.println("Feminino");
        }
    }
}