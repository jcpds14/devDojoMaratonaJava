package academy.devdojo.maratonajava.javacore.Bintrometodos.test;

import academy.devdojo.maratonajava.javacore.Bintrometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Jean");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{2553.40, 2000.67, 3190.30});
        funcionario.imprimeDados();
        System.out.println("Média " + funcionario.getMedia());
    }
}