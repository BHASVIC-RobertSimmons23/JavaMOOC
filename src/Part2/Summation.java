package Part2;

public class Summation {
    public static void main(String[] args) {
        int answer = summation(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }

    public static int summation(int... numbers) {
        int total = 0;
        for(int number: numbers) {
            total += number;
        }
        return total;
    }
}
