package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("44444-444");
        Pessoa pessoa = new Pessoa("Jean");
        pessoa.getNome();
        pessoa.setCpf("111-111-111-11");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("---------------");
        Funcionario funcionario = new Funcionario("Carlos");
        funcionario.getNome();
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3000);
        funcionario.imprime();
    }
}