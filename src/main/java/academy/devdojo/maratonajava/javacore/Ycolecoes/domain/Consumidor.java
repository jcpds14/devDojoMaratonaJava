package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private Long id;
    private String name;

    public Consumidor(String name) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}