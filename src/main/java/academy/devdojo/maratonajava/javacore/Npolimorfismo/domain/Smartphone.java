package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

import com.sun.jdi.ClassObjectReference;
import org.w3c.dom.ls.LSOutput;

public class Smartphone extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.15;
    private String bluetoothAddress;
    public Smartphone(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Smartphone");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getBluetoothAddress() {
        return "Código Hash BLuetooth: " + hashCode();
    }
}