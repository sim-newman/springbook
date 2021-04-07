import java.io.IOException;

public class SpamCheckerApplication {

    public static void main(String[] args) throws IOException {

    /*Parameter 1 is the word to check
    Parameter 2 is the location of the spam file. If one is not passed
    it will default to standard.
    */
    SpamDetector spamDetector = SpamDetectorFactory.getInstance(args);
    System.out.println(spamDetector.containsSpam(args[0]));


    }
}
