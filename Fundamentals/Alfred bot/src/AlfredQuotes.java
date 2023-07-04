import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        return "It is currently " + dateFormat.format(date);
    }

    public String respondBeforeAlexis(String conversation) {
        int alexisIndex = conversation.indexOf("Alexis");
        int alfredIndex = conversation.indexOf("Alfred");

        if (alexisIndex >= 0) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (alfredIndex >= 0) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
}