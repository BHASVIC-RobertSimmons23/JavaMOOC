package Part6.CargoHoldExercise;

public class Item {
    private final int weight;
    private final String name;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " (" + weight + "kg)";
    }
}
