package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Eshir", "Ashen", 200, 0);
        cat.run(198);
        cat.swim(4);

        Dog dog = new Dog("Remy", "golden", 500, 10);
        dog.run(486);
        dog.swim(7);
    }

}
