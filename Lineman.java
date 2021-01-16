package strategydesignpattern;

import java.util.Random;

public class Lineman extends Player {
    Lineman(String name) {
        super(name);
    }

    public void setDefenseBehavior() {
        Random rand = new Random();
        switch (rand.nextInt(3)) {
            case 0:
                defensebehavior = new BlockBehavior();
                break;
            case 1:
                defensebehavior = new StripBehavior();
                break;
            default:
                defensebehavior = new SackBehavior();
                break;
        }
    }

    public void setOffenseBehavior() {
        offensebehavior = new OBlockBehavior();
    }
}
