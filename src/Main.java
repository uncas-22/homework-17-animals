import animals.*;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 2, "лесная местность", 85, "растения");
        Herbivores giraffe = new Herbivores("Жираф", 5, "саванна", 90, "растения и листва");
        Herbivores horse = new Herbivores("Лошадь", 3, "открытая местность", 150, "растения");
        gazelle.sleep();
        System.out.println(giraffe.equals(gazelle));
        System.out.println(giraffe.equals(giraffe));
        giraffe.eat();
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println("\n");

        Predators hyena = new Predators("Гиена", 4, "лес", 80, "тушки животных");
        Predators tiger = new Predators("Тигр", 6, "саванна", 100, "мясо");
        Predators bear = new Predators("Медведь", 8, "лесная чаща", 110, "рыба");
        tiger.hunt();
        bear.eat();
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        System.out.println("\n Земноводные");
        Amphibians frog = new Amphibians("Лягушка", 1, "пресные водоемы");
        Amphibians grassSnake = new Amphibians("Уж", 2, "пресные водоемы");
        frog.eat();
        frog.hunt();
        System.out.println(frog);
        System.out.println(grassSnake);

        System.out.println("\n Летающие птицы");
        Flying seagull = new Flying("Чайка", 2, "Прибрежные районы", "полет");
        Flying albatross = new Flying("Альбатросс", 1, "Прибрежные районы", "полет");
        Flying sokol = new Flying("Сокол", 3, "Скалистая местность", "полет");
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(sokol);
        sokol.toFly();
        seagull.eat();

        System.out.println("\n Нелетающие птицы");
        Flightless peacock = new Flightless("Павлин", 3, "Тропические леса", "ходит на двух лапках");
        Flightless penguin = new Flightless("Пингвин", 2, "Вблизи океанов", "ходят на двух лапках и плавают");
        Flightless dodoBird = new Flightless("Додо", 5, "Леса", "ходят на двух лапках");
        peacock.eat();
        dodoBird.walk();
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
    }
}