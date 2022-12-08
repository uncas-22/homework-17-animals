package animals;
import java.util.Objects;

public class Mammals extends Animals {
    private String habitat;
    private int speedOfMoving;

    public Mammals(String nameAnimals, int ageAnimals, String habitat, int speedOfMoving) {
        super(nameAnimals, ageAnimals);
        setHabitat(habitat);
        setSpeedOfMoving(speedOfMoving);
    }


    public void go() {

    }

    public void sleep() {

    }

    public void eat() {

    }

    public void walk() {

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

    public int getSpeedOfMoving() {
        return speedOfMoving;
    }

    public void setSpeedOfMoving(int speedOfMoving) {
        if (speedOfMoving > 0) {
            this.speedOfMoving = speedOfMoving;
        } else {
            this.speedOfMoving = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return speedOfMoving == mammals.speedOfMoving && Objects.equals(habitat, mammals.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, speedOfMoving);
    }

    public String toString() {
        return super.toString() + ", обитают " + getHabitat() + ", развивают скорость до " + getSpeedOfMoving() + " км/ч.";
    }
}
