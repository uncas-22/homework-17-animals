package animals;
import java.util.Objects;

public class Predators extends Mammals {

    private String typeFood;

    public Predators(String nameAnimals, int ageAnimals, String habitat, int speedOfMoving, String typeFood) {
        super(nameAnimals, ageAnimals, habitat, speedOfMoving);
        setTypeFood(typeFood);
    }

    public void go() {
        System.out.println("По открытой местности");

    }

    public void sleep() {
        System.out.println("В основном в ночное время");

    }

    public void eat() {
        System.out.println("Большая часть рациона - мясо.");

    }

    public void walk() {
        System.out.println("В поисках еды");
    }

    public void hunt() {
        System.out.println("Преследуют жертву и выжидают удобный момент для нападения");
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood != null && !typeFood.isBlank() && !typeFood.isEmpty()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "тушки животных";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeFood, predators.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    @Override
    public String toString() {
        return super.toString() + " Основная пища: " + getTypeFood();
    }
}
