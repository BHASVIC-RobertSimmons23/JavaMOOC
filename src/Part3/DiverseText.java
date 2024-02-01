package Part3;

import java.util.Scanner;

public class DiverseText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int greatestAge = 0;
        String greatestAgeName = null;
        do {
            input = scanner.nextLine();
            String[] words = input.split(",");
            if(words.length > 1) {
                int age = Integer.parseInt(words[1]);
                if(age > greatestAge) {
                    greatestAge = age;
                    greatestAgeName = words[0];
                }
            }
        } while(!input.isEmpty());
        if(greatestAgeName != null) {
            System.out.println("Greatest age: " + greatestAge);
            System.out.println("Name of the oldest: " + greatestAgeName);
        }

    }
}
