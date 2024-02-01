package Part3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        ArrayList<Integer> numbers  = new ArrayList<>();
        int input;
        int smallest = -1;
        do {
            input = scanner.nextInt();
            if(input != 9999) {
                numbers.add(input);
                if(smallest == -1 || input < smallest) smallest = input;
            }
        } while (input != 9999);

        System.out.println("Smallest number: " + smallest);
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
