package strategydesignpattern;

import java.util.Random;

public class QuarterBack extends Player {

    QuarterBack(String name)
    {
       super(name);
    }
    public void setDefenseBehavior()
    {
        defensebehavior = null;
    }

    public void setOffenseBehavior()
    {
        Random rand = new Random();

        if (rand.nextInt(2) == 1)
        {
            offensebehavior = new RunBehavior();
        }
        {
            offensebehavior = new PassBehavior();
        }
    }
}
