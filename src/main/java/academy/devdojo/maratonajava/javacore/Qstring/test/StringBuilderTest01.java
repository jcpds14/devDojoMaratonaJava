package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Jean";
        nome.concat(" Carlos");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Jean Carlos");
        sb.append(" Pereira").append(" dos Santos");
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,3);
        sb.reverse();
        System.out.println(sb);
    }
}