package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {//Interface é criada pra ser implementada

    //todos atributos em uma interface são constantes
    public abstract void load(); //todos métodos padrão no java é um public abstract

    public default void checkPermissions() {
        System.out.println("Checando permissões");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }

}