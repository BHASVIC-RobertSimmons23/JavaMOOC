package Part5.OverloadExercise;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10);
        System.out.println(counter.getValue());
        counter.increase();
        System.out.println(counter.getValue());
        counter.decrease(5);
        System.out.println(counter.getValue());
    }
}
