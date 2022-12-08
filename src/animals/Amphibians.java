package animals;

import java.util.Objects;

public class Amphibians extends Animals {

    private String habitat;

    public Amphibians(String nameAnimals, int ageAnimals, String habitat) {
        super(nameAnimals, ageAnimals);
        setHabitat(habitat);
    }


    public void go() {
        System.out.println("Большую часть времени проводят в воде");

    }

    public void sleep() {
        System.out.println("Любят прятаться в земле");

    }

    public void eat() {
        System.out.println("В основном едят насекомых");

    }

    public void hunt() {
        System.out.println("Выжидают удобный момент и нападают");
    }


    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "некорректные данные";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ". Обитают: " + getHabitat() + ".";
    }
}
