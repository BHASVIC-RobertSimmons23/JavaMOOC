package Part2;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double sqrt = Math.sqrt(num1 + num2);
        System.out.println("Result: " + sqrt);
    }
}
