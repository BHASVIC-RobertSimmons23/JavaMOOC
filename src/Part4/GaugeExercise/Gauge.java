package Part4.GaugeExercise;

public class Gauge {
    private int value;

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public int getValue() {
        return value;
    }

    public boolean full() {
        return value == 5;
    }
}
