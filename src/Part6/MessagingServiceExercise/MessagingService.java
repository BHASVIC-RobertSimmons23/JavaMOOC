package Part6;

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages = new ArrayList<Message>();

    public void add(Message message) {
        messages.add(message);
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Message m: messages) {
            result.append(m).append("\n");
        }
        return result.toString();
    }
}
