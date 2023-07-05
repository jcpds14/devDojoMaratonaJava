package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    //0 - Bloco de inicalização estático da superClasse  é executado quando a JVM carregar a classe pai
    //1 - Bloco de inicalização estático da subClasse  é executado quando a JVM carregar a classe filha
    //2 - É alocado espaço em memória pro objeto da superclasse
    //3 - Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado
    //4 - O bloco de inicialização da superclasse é executado na ordem em que aparece
    //5 - Construtor é executado da superclasse é executado
    //6 - É alocado espaço em memória pro objeto da sunbclasse
    //7- Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
    //8 - O bloco de inicialização da subclasse é executado na ordem em que aparece
    //9- Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Jean");
    }
}