import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SpamDetectorFactory {

    public static SpamDetector getInstance(String filename) throws IOException {

        List<String> spamWords = new ArrayList<String>();
        if (filename != null && filename != "") {
            spamWords = Files.readAllLines(Paths.get(filename));
        }else{
            spamWords.add("illegal");
        }

        return new SimpleSpamDetector(spamWords);

    }

}
