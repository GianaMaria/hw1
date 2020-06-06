package lesson6;

public class Animal {
    String name;
    String color;
    int runLimitation; //ограничение
    int swimLimitation;

    public Animal(String name, String color, int runLimitation, int swimLimitation) {
        this.name = name;
        this.color = color;
        this.runLimitation = runLimitation;
        this.swimLimitation = swimLimitation;
    }

    public void run(int a) {
        if (a < runLimitation) {
            System.out.println(name + " пробежал " + a + " м ");
        } else {
            System.out.println(name + " не может столько бежать, ограничение: " + runLimitation);
        }
    }

    public void swim(int a) {
        if (a < swimLimitation) {
            System.out.println(name + " проплыл " + a + " м ");
        } else {
            System.out.println(name + " не может столько плыть, ограничение: " + swimLimitation);
        }
    }
}
