package Part3;

import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            input = scanner.nextLine();
            String[] words = input.split(" ");
            for(String word: words) {
                if(word.contains("av")) System.out.println(word);
            }
        } while(!input.isEmpty());
    }
}
