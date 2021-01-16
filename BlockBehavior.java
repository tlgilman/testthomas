package strategydesignpattern;
import java.util.Random;
public class BlockBehavior implements DefenseBehavior{
    Random rand = new Random();
    private String[] phrases = {"kick", "punt", "pass", "catch"};
    public String play()
    {
        return "Block a " + phrases[rand.nextInt(phrases.length)];
    }
}
