package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Jean"; // String constan pool
        String nome2 = "Jean";
        nome.concat(" Carlos"); // é o mesmo que nome += " Carlos"
        System.out.println(nome);
        System.out.println(nome == nome2);//Faz referência ao mesmo Objeto em memória
        nome = nome.concat(" Carlos");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Jean");//1 variável de referência, 2 objeto de tipo string, 3 uma string no pool de strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());//Olha para o conteúdo da variável

        // As Strings são imutáveis é preciso ter cuidado ao valor da variável de referência se não, não será possível alterar
        // o valor novo
    }
}