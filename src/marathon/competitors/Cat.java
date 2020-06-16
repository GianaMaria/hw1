package marathon.competitors;

public class Cat implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Cat(String type, String name, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Cat(String name) {
        this("cat", name,500,3);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.printf("%s %s успешно пробежал %d метров\n", type, name, dist);
        } else {
            System.out.printf("%s %s не смог пробежал %d метров\n", type, name, dist);
            onDistance = false;
        }

    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.printf("%s %s успешно прыгнул на %d метров\n", type, name, height);
        } else {
            System.out.printf("%s %s не смог прыгнуть на такую высоту в %d метров\n", type, name, height);
            onDistance = false;
        }
    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %s %b\n", type, name, onDistance);

    }
}
