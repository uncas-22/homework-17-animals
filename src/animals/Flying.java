package animals;
import java.util.Objects;

public class Flying extends Birds{
    private String typeMoving;

    public Flying(String nameAnimals, int ageAnimals, String habitat, String typeMoving) {
        super(nameAnimals, ageAnimals, habitat);
        setTypeMoving(typeMoving);

    }

    public void go() {
        System.out.println("В осоновном парят в воздухе");

    }

    public void sleep() {
        System.out.println("На возвышенностях");
    }

    public void eat() {
        System.out.println("В рацион входит мелкая рыбешка");
    }

    public void hunt() {
        System.out.println("Выжидают и нападают");
    }

    public void toFly() {
        System.out.println("Летают расправив крылья");

    }

    public String getTypeMoving() {
        return typeMoving;
    }

    public void setTypeMoving(String typeMoving) {
        if (typeMoving != null && !typeMoving.isEmpty() && !typeMoving.isBlank()) {
            this.typeMoving = typeMoving;
        } else {
            this.typeMoving = "некорректрные данны";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeMoving, flying.typeMoving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeMoving);
    }

    @Override
    public String toString() {
        return super.toString() + ". Основной способ передвижения -  " + getTypeMoving() + ".";
    }
}
