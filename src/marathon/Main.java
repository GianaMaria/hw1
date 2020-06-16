package marathon;

import marathon.competitors.Cat;
import marathon.competitors.Competitor;
import marathon.competitors.Person;
import marathon.competitors.Robot;
import marathon.obstacles.Obstacle;
import marathon.obstacles.Treadmill;
import marathon.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Person("Leo"),
                new Cat("Draco"),
                new Robot("Nyx")
        };

        Obstacle[] obstacles = {
                new Treadmill(400),
                new Wall(2)
        };

        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isDistance()){
                    break;
                }
            }
        }

        for (Competitor competitor : competitors) {
            competitor.info();
        }
    }
}
