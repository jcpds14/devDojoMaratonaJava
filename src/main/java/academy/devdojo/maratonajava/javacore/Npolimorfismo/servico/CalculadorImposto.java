package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Smartphone;

public class CalculadorImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if(produto instanceof Smartphone){
            String btHashCode = ((Smartphone) produto).getBluetoothAddress();
            //Isso é o mesmo que -> Smartphone smartphone = (Smartphone) produto;

            System.out.println(btHashCode);
        }
    }
}