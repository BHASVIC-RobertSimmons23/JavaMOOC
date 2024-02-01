package Part3;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double totalYears = 0;
        double personCount = 0;
        String longestName = "";
        do {
            input = scanner.nextLine();
            String[] words = input.split(",");
            if(words.length > 1) {
                int year = Integer.parseInt(words[1]);
                totalYears += year;
                personCount++;
                if(words[0].length() > longestName.length()) longestName = words[0];
            }
        } while(!input.isEmpty());
        System.out.println("Longest Name: " + longestName);
        System.out.println("Average birth year: " + (totalYears / personCount));
    }
}
