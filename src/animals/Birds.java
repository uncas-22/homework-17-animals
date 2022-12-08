package animals;

import java.util.Objects;

public class Birds extends Animals {
    private String habitat;

    public Birds(String nameAnimals, int ageAnimals, String habitat) {
        super(nameAnimals, ageAnimals);
        setHabitat(habitat);
    }

    public void go() {

    }

    public void sleep() {

    }

    public void eat() {

    }

    public void hunt() {

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
        Birds birds = (Birds) o;
        return Objects.equals(habitat, birds.habitat);
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
