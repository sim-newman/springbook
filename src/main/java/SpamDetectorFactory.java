import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SpamDetectorFactory {
    /**
     * @param args
     * @return
     * @throws IOException
     */
    public static SpamDetector getInstance(String[] args) throws IOException {

//get from local spam checker
        if (args.length <= 2) {
            //Build list of spam words.
            String filename = args[1];
            List<String> spamWords = new ArrayList<String>();
            if (filename != null && filename != "") {
                spamWords = Files.readAllLines(Paths.get(filename));
            } else {
                spamWords.add("illegal");
            }
            return new SimpleSpamDetector(spamWords);
        } else {
            return new RemoteSpamDetector(args[0], args[1], args[2]);
        }
    }

}
