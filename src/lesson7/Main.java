package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 10, false),
                new Cat("Эшир", 10, false),
                new Cat("Мурзик", 20, false)
        };
        Plate plate = new Plate(20);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);

        }
        plate.info();
        plate.increaseFood(150);
        plate.info();

    }
}
