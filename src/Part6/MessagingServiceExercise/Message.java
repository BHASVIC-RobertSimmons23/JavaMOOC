package Part6;
import java.util.Date;

public class Message {
    private String content;
    private String author;
    private Date timeStamp;

    public Message(String content, String author) {
        this.content = content;
        this.author = author;
        this.timeStamp = new Date();
    }

    public String toString() {
        return "At " + timeStamp + ", " + author + " said: " + content;
    }
}
