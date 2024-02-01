package Part3;

import java.util.Scanner;
import java.util.ArrayList;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        ArrayList<Integer> numbers  = new ArrayList<>();
        int input;
        do {
            input = Integer.parseInt(scanner.nextLine());
            if(input != 0) numbers.add(input);
        } while (input != 0);
        System.out.println("Sum of 2nd and 3rd: " + (numbers.get(1) + numbers.get(2)));
    }
}
