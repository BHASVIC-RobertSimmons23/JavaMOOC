import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is you name? ");

        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", nice to meet you!");
    }
}
