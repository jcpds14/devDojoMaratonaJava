package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionalSwitchEx {
    public static void main(String[] args) {
        int diaDaSemana = 0;

        switch (diaDaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
            case 1:
                System.out.println("Fim de Semana");
                break;
            default:
                System.out.println("Digite de 1-7");
        }
    }
}