import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        String inputString = scanner.nextLine();
        double number = Double.parseDouble(inputString);
        System.out.println("You gave the number " + number);
    }
}
