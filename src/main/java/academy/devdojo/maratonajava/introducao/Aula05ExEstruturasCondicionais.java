package academy.devdojo.maratonajava.introducao;

public class Aula05ExEstruturasCondicionais {
    public static void main(String[] args) {
        double salarioAnual = 26000;
        double porcentagemImposto = 0;
        double desconto = 0;

        if(salarioAnual < 25344.12){
            porcentagemImposto = 0;
        }else if(salarioAnual >= 25344.12 && salarioAnual <= 33919.80){
            porcentagemImposto = 7.5;
        }else if(salarioAnual > 33919.80 && salarioAnual <= 45012.60){
            porcentagemImposto = 15;
        }else if(salarioAnual > 45012.61 && salarioAnual <= 55976.16){
            porcentagemImposto = 22.5;
        }else{
            porcentagemImposto = 27.5;
        }
        if(porcentagemImposto == 0){
            System.out.println("ISENTO");
        }else {
            desconto = (porcentagemImposto * salarioAnual) / 100;
            double salarioAnualDescontado = salarioAnual - desconto;

            System.out.printf("Seu salário é %.2f por ano\n", salarioAnual);
            System.out.printf("Imposto é %.2f%%\n", porcentagemImposto);
            System.out.printf("Desconto aplicado %.2f\n", desconto);
            System.out.printf("Salário líquido %.2f\n", salarioAnualDescontado);
        }


    }
}