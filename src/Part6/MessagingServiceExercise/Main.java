package Part6;

public class Main {
    public static void main(String[] args) {
        MessagingService service = new MessagingService();
        service.add(new Message("Hi!", "John"));
        service.add(new Message("Test!", "Steve"));
        System.out.println(service);
    }
}
