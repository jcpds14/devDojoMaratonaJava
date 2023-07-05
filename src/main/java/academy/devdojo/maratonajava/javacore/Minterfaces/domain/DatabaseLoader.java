package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

//implements se usa no lugar de extends quando se trata de interfaces
//pode ser implemetados quantas interfaces desejar, diferente de Classes
public class DatabaseLoader implements DataLoader, DataRemover{
    //private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checando permissões do banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na DatabaseLoader");
    }
}