import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int input = scanner.nextInt();
        for(int i = input - 1; i > 0; i--) input *= i;
        System.out.println("Factorial: " + input);
    }
}
