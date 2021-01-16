package strategydesignpattern;
import java.util.Random;

public class ReceiveBehavior implements OffenceBehavior{
    Random rand = new Random();
    private String[] phrases = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
    public String play()
    {
        return "runs a " + phrases[rand.nextInt(phrases.length)];
    }
}
