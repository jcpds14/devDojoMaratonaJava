package academy.devdojo.maratonajava.introducao;
//Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
//Valor da parcela tem que ser >= 1000
public class Aula06EstruturaDeRepeticaoEx {
    public static void main(String[] args) {
        double valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcelas = valorCarro / parcela;
            if(valorParcelas < 1000){
                System.out.println("Este carro não pode ser parcelado em " + parcela + " vezes");
                break;
            }
            System.out.println("Parcela " + parcela + "x de R$" + valorParcelas);
        }
    }
}