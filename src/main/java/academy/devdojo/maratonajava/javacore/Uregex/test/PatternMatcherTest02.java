package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //Meta caracteres
        // \d = Todos os dígitos númericos
        // \D = Tudo que não for dígito
        // \s = Espaços em branco - em java é \t \n \f \r
        // \S = Tudo exceto os brancos
        // \w = tudo de a-zA-Z - letras e _
        // \W = tudo que não for \w
        String regex = "\\d";
        String texto = "ausoh3179grh19gq9odhc9qh80ncaosn12";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}