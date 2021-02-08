import java.util.ArrayList;
import java.util.List;

public class SpamCheckerApplication {

    public static void main(String[] args) {
        List<String> spamWords = new ArrayList<String>();
        spamWords.add("illegal");

       SimpleSpamDetector simpleSpamDetector = new SimpleSpamDetector(spamWords);
        System.out.println(simpleSpamDetector.containsSpam(args[0]));
    }
}
