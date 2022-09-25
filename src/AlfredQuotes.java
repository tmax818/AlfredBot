import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    /**
     * Returns a greeting that includes the person's name.
     * @param name
     * @return
     */
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    /**
     * Returns a polite announcement of the current date and time.
     * @return String
     * It is currently <current data/time>
     */
    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
    }

    /**
     * AlfredBot will periodically process audio (Alfred is listening.) Write a method that accepts any string of conversation and responds appropriately.
     * @param conversation
     * @return
     */
    public String respondBeforeAlexis(String conversation) {

        if(conversation.indexOf("Alexis") > -1) {
            return "She's really of no help. What can I get for you?";
        }

        if (conversation.indexOf("Alfred") > -1) {
            return "At your service, naturally. How may I be of assistance?";
        }

        return "Right. And with that I shall retire.";
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

