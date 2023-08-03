package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String title;
    private double price;
    private int quantity;

    public Manga(Long id, String title, double price) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(title, "Título não pode ser nulo");
        Objects.requireNonNull(price, "Preço não pode ser nulo");
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Manga(Long id, String title, double price, int quantity) {
        this(id, title, price);
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(title, manga.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Manga outroManga) {
        // negativo se o this for menor que o outroManga
        // positivo se o this for maior que o outroManga
        // 0 se forem iguais
//        if(this.id < outroManga.getId()){
//            return -1;
//        }else if(this.id > outroManga.getId()){
//            return 1;
//        }else{
//            return 0;
//
//        }
//       return this.id.compareTo(outroManga.getId());//isso não pode ser utilizado em tipos primitivos
        return this.title.compareTo(outroManga.getTitle());
//        return Double.compare(price, outroManga.getPrice());//assim para tipos primitivos
    }
}