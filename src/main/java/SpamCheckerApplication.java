import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SpamCheckerApplication {

    public static void main(String[] args) throws IOException {
        List<String> spamWords = new ArrayList<String>();
        if (args.length == 2) {
            spamWords = Files.readAllLines(Paths.get(args[1]));
        }else{
            spamWords.add("illegal");
        }

        SimpleSpamDetector simpleSpamDetector = new SimpleSpamDetector(spamWords);
        System.out.println(simpleSpamDetector.containsSpam(args[0]));
    }
}
