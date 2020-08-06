package marathon.obstacles;

import marathon.competitors.Competitor;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor c) {
        c.jump(height);
    }
}
