import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String input = scanner.nextLine();
        System.out.println(input.equals("Caput Draconis") ? "Welcome!" : "Off with you!");
    }
}
