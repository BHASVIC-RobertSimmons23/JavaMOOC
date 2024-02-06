package Part5.OverloadExercise;

public class Counter {
    private int value;
    public Counter() {
        value = 0;
    }

    public Counter(int startValue) {
        value = startValue;
    }

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void increase(int increment) {
        value += increment;
    }

    public void decrease() {
        value--;
    }

    public void decrease(int increment) {
        value -= increment;
    }
}
