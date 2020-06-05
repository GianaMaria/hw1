package lesson7;

public class Cat {
    String name;
    int appetite; //сколько ест за раз
    boolean satiety; //сытость

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite, getName());
    }
}
