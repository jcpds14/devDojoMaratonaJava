package academy.devdojo.maratonajava.introducao;
//Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
//Valor da parcela tem que ser >= 1000
public class Aula06EstruturaDeRepeticaoEx02 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for(int parcela = (int) valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + "x de R$" + valorParcela);
        }
    }
}