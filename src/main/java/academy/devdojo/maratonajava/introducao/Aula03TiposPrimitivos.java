package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Jean";
        String endereco = "Ladeira do Acupe, n39";
        double salario = 2500.00D;
        String dataRecebimento = "21/06/2023";
        String relatorio = "Eu "+ nome+", morando no endereço " + endereco + ", confirmo que recebi o salário de " +
                salario + ", na data " + dataRecebimento;

        System.out.println(relatorio);
    }
}