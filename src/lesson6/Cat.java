package lesson6;

public class Cat extends Animal {

    public Cat(String name, String color, int runLimitation, int swimLimitation) {
        super(name, color, runLimitation, swimLimitation);
    }

    @Override
    public void swim(int a) {
        System.out.println("Кот не умеет плавать");
    }
}

