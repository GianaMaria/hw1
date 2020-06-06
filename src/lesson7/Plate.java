package lesson7;

public class Plate {
    private int food;
    boolean satiety = false;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int a, String name) {
        if (food >= a) {
            food -= a;
            satiety = true;

            System.out.println(name + " ест..");

            if (satiety = true) {
                System.out.println(name + " наелся");
            } else {
                System.out.println(name + " голоден");
            }
        } else {
            System.out.println("Недостаточно еды в тарелке.");
            System.out.println(name + " голоден");
        }
    }

    public void increaseFood(int n) {
        food += n;
        System.out.println("В тарелку добавили " + n + " еды.");
    }

    public void info() {
        System.out.println("В тарелке осталось: " + food + " еды");

    }
}
