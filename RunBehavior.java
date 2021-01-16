package strategydesignpattern;
import java.util.Random;

public class RunBehavior implements OffenceBehavior{
    Random rand = new Random();
    private String[] phrases = {"drive (up the gut)", "draw", "pitch", "reverse"};
    public String play()
    {
        return "runs a " + phrases[rand.nextInt(phrases.length)];
    }

}


