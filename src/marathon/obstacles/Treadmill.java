package marathon.obstacles;

import marathon.competitors.Competitor;

public class Treadmill extends Obstacle{

    int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(dist);
    }
}
