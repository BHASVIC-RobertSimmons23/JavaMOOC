package Part8.AbbreviationsExercise;

import java.util.HashMap;

public class Abbreviations {
    private final HashMap<String, String> abbreviationMap = new HashMap<>();
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        if(!hasAbbreviation(abbreviation)) return null;
        return abbreviationMap.get(abbreviation);
    }
}
