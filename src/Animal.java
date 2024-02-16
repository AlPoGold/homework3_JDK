import java.util.Objects;

public class Animal {
    private String name;
    private boolean isWalking;

    public Animal(String name, boolean isWalking) {
        this.name = name;
        this.isWalking = isWalking;
    }

    public Animal() {
        this("Animal", false);
    }

    public String getName() {
        return name;
    }

    public boolean isWalking() {
        return isWalking;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", isWalking=" + isWalking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return isWalking == animal.isWalking && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isWalking);
    }
}
