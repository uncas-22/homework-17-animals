package animals;
import java.util.Objects;

public class Flightless extends Birds {
    private String typeMoving;

    public Flightless(String nameAnimals, int ageAnimals, String habitat, String typeMoving) {
        super(nameAnimals, ageAnimals, habitat);
        setTypeMoving(typeMoving);
    }

    public void go() {
        System.out.println("Передвигаются на двух лапках по земле");

    }

    public void sleep() {
        System.out.println("Спят стоя");
    }

    public void eat() {
        System.out.println("В рацион входит мелкая рыбешка");
    }

    public void hunt() {
        System.out.println("Выжидают и нападают");
    }

    public void walk() {
        System.out.println("Гуляют вблизи своих же сородичей");

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
        Flightless that = (Flightless) o;
        return Objects.equals(typeMoving, that.typeMoving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeMoving);
    }

    @Override
    public String toString() {
        return super.toString() + " Основной способ передвижения -  " + getTypeMoving() + ".";
    }
}
