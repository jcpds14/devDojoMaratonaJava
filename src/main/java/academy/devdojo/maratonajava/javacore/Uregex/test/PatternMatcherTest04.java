package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        //Meta caracteres
        // \d = Todos os dígitos númericos
        // \D = Tudo que não for dígito
        // \s = Espaços em branco - em java é \t \n \f \r
        // \S = Tudo exceto os brancos
        // \w = tudo de a-zA-Z - letras e _
        // \W = tudo que não for \w
        // [abc] = range de caracteres - neste caso retorna a, b ou c
        //Modificadores
        // ? Zero ou uma ocorrência
        // * zero ou mais
        // + uma ou mais
        // {n, m} de n até m
        // () agrupamento
        // | ou - ex: o(c|v)O seria ovo ou oco
        // $ fim da linha
        String regex = "0[xX]([a-fA-F0-9])+\\s|$";
        String texto = "0x 0x231 0x 12213 0xfeae13";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        int numeros = 0xFFFFFF;
        System.out.println(numeros);

    }
}