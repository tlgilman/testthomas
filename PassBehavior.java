package strategydesignpattern;
import java.util.Random;

public class PassBehavior implements OffenceBehavior{
    Random rand = new Random();
    private String[] phrases = {"{slant route", "out route", "seem route", "screen pass", "hail mary"};
    public String play()
    {
        return "throws a " + phrases[rand.nextInt(phrases.length)];
    }
}
