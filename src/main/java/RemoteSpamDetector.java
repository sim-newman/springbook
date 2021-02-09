public class RemoteSpamDetector implements SpamDetector{

    public RemoteSpamDetector(String url, String username, String password) {

    }

    @Override
    public boolean containsSpam(String value) {
    System.out.println("Using the remote spam checker");
        return false;
    }
}
