package Part4.StatisticsExercise;

public class Statistics {
    private double count = 0;
    private double sum = 0;

    public void addNumber(int number) {
        count++;
        sum += number;
    }

    public double getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double average() {
        return sum / count;
    }
}
