import java.util.ArrayList;
import java.util.List;

public class SimpleSpamDetector {


    private List<String> spamWords = new ArrayList<String>();

    public SimpleSpamDetector(List<String> spamWords) {
        this.spamWords = spamWords;
    }

    public boolean containsSpam(String value){
        for (String spam : spamWords){
            if (value.toLowerCase().contains(spam)) {
                return true;
            }
        }

        return false;
    }
}
