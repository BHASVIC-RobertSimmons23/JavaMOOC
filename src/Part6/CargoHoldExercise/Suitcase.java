package Part6.CargoHoldExercise;

import java.util.ArrayList;

public class Suitcase {
    private final int maxWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int total = 0;
        for(Item i: items) total += i.getWeight();
        return total;
    }

    public String toString() {
        return items.size() + " items (" + totalWeight() + " kg)";
    }

    public boolean addItem(Item newItem) {
        if(totalWeight() + newItem.getWeight() > maxWeight) return false;
        items.add(newItem);
        return true;
    }

    public void printItems() {
        for(Item i: items) System.out.println(i);
    }

    public Item heaviestItem() {
        Item heaviest = items.get(0);
        for(Item i: items) {
            if(i.getWeight() >= heaviest.getWeight()) heaviest = i;
        }
        return heaviest;
    }
}
