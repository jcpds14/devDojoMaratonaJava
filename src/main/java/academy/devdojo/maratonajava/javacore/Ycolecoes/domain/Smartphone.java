package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

public class Smartphone {

    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    // Reflexivo: x.equals(x) tem que retornar true para tudo que for diferente de null
    // Simetrico: para x e y diferentes de null, se x.equals(y) retorna true logo, y.equals(x) retorna true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) e x.equals(z) retorna true,
    // logo y.equals(z) retorna true
    // Consitente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) retorna false
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    //se x.equals(y) == true, y.hashCode() == x.hashCode()
    //y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    //x.equals(y) == false
    //y.hashCode() != x.hashCode(), x.equals(y) == false

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}