package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked exception -> São filhas da Classe Exception diretamente, e se não tratadas são lançadas em tempo de
        // compilação. Ou seja, seu código nem é compilado.

        //Unchecked exception -> Pode ser a classe RuntimeException ou as filhas da Classe RuntimeException, quando o
        //programa que lança, quase sempre o erro foi do densenvolvedor. É necessário tratar essas exceções.

        Object object = null;
        System.out.println(object.toString());
//        int[] arr = {1,2};
//        System.out.println(arr[2]);
    }
}