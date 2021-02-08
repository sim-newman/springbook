import java.io.IOException;
public class SpamCheckerApplication {

    public static void main(String[] args) throws IOException {
        System.out.println
                (SpamDetectorFactory.getInstance(args[1]).containsSpam(args[0]));
    }
}
