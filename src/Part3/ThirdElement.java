package Part3;

import java.util.Scanner;
import java.util.ArrayList;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        ArrayList<String> names  = new ArrayList<>();
        String input;
        do {
            input = scanner.nextLine();
            if(!input.isEmpty()) names.add(input);
        } while (!input.isEmpty());
        System.out.println("Third Element: " + names.get(2));
    }
}
