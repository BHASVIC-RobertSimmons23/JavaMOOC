package Part6.CargoHoldExercise;

import java.util.ArrayList;

public class Hold {
    private final int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int total = 0;
        for(Suitcase s: suitcases) total += s.totalWeight();
        return total;
    }

    public boolean addSuitcase(Suitcase newSuitcase) {
        if(totalWeight() + newSuitcase.totalWeight() > maxWeight) return false;
        suitcases.add(newSuitcase);
        return true;
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printItems() {
        for(Suitcase s: suitcases) s.printItems();
    }
}
