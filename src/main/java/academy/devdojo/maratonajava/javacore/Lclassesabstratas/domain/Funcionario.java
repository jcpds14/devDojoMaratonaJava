package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa{//Classes abstratas não podem ser instanciadas
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo (Implementação da classe avô Pessoa)");
    }

    public abstract void calculaBonus();
}