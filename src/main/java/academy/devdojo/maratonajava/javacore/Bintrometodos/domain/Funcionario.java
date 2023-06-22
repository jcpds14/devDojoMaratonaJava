package academy.devdojo.maratonajava.javacore.Bintrometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeDados(){
        System.out.println("---------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }
        for(double salario: salarios){
            System.out.print(salario + " ");
        }

        imprimeMedia();
    }

    public void imprimeMedia(){
        if(salarios == null){
            return;
        }
        for(double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nA média salarial é " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}