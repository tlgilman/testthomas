package strategydesignpattern;

public class Receiver extends Player {
    Receiver(String name)
    {
       super(name);
    }
    public void setDefenseBehavior()
    {
        defensebehavior = null;
    }

    public void setOffenseBehavior()
    {
        offensebehavior = new ReceiveBehavior();
    }
}
