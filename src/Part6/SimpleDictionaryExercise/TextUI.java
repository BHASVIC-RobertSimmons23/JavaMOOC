package Part6.SimpleDictionaryExercise;
import java.util.Scanner;
import java.util.Optional;
public class TextUI {
    private final SimpleDictionary dictionary;
    private final Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        String input;
        boolean keepGoing = true;
        while(keepGoing) {
            System.out.print("Command: ");
            input = scanner.nextLine();
            switch (input) {
                case "end" -> {
                    System.out.println("Bye bye!");
                    keepGoing = false;
                }
                case "add" -> {
                    System.out.print("Word: ");
                    String word = scanner.nextLine();
                    System.out.print("Translation: ");
                    String translation = scanner.nextLine();
                    dictionary.addWord(new Word(word, translation));
                }
                case "search" -> {
                    System.out.print("To be translated: ");
                    String word = scanner.nextLine();
                    Optional<String> result = dictionary.translate(word);
                    if(result.isPresent()) System.out.println(result.get());
                    else System.out.println("Word " + word + " was not found!");
                }
                default -> System.out.println("Unknown command");
            }
        }
    }
}
