package academy.devdojo.maratonajava.javacore.Oexcecoes.error.test;

public class StackOverflowErrorTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}