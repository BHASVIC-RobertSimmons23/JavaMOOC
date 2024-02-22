package Part6.SimpleDictionaryExercise;

import java.util.ArrayList;
import java.util.Optional;

public class SimpleDictionary {
    private final ArrayList<Word> words = new ArrayList<>();

    public void addWord(Word newWord) {
        words.add(newWord);
    }

    public Optional<String> translate(String source) {
        Optional<Word> translation = words.stream().filter(word -> word.getWord().equals(source)).findFirst();
        return translation.map(Word::getTranslation);
    }
}
