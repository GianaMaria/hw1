package marathon.competitors;

public class Robot implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Robot(String type, String name, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Robot(String name) {
        this("robot",name,2000,3);
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
//        if (height == 0) {
//            System.out.printf(" %s %s не умеет прыгать\n", type, name);
//            onDistance = false;
//            return;
//        }
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
