package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");

        }
        return null;
    }
    private static void abreConexao2() {
//        É possível utilizar o try/finally mas ele é muito raro de ser usado.
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}