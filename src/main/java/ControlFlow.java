import java.io.IOException;

public class ControlFlow {

    public void run(String[] args) throws IOException {
        SpamDetector spamDetector = SpamDetectorFactory.getInstance(args);
        System.out.println(spamDetector.containsSpam(args[0]));
    }

}
