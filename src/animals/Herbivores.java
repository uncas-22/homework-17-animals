package animals;
import java.util.Objects;

public class Herbivores extends Mammals {

    private String typeOfFood;

    public Herbivores(String nameAnimals, int ageAnimals, String habitat, int speedOfMoving, String typeOfFood) {
        super(nameAnimals, ageAnimals, habitat, speedOfMoving);
        setTypeOfFood(typeOfFood);
    }

    public void go() {
        System.out.println("По открытой местности");

    }

    public void sleep() {
        System.out.println("В основном в ночное время");

    }

    public void eat() {
        System.out.println("Большая часть рациона - растения.");

    }

    public void walk() {
        System.out.println("В поисках еды");
    }

    public void graze() {
        System.out.println("Жуют свежую сочную зелень");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isBlank() && !typeOfFood.isEmpty()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "зеленые растения, сочная трава";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return super.toString() + " Основная пища: " + getTypeOfFood();
    }
}
