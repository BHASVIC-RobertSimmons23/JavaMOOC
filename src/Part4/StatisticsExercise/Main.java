package Part4.StatisticsExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            input = scanner.nextInt();
            if(input != -1) {
                statistics.addNumber(input);
                if(input % 2 == 0) evenStats.addNumber(input);
                else oddStats.addNumber(input);
            }
        } while (input != -1);
        System.out.println("Combined");
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.getSum());
        System.out.println("Average: " + statistics.average());
        System.out.println("\nEven");
        System.out.println("Count: " + evenStats.getCount());
        System.out.println("Sum: " + evenStats.getSum());
        System.out.println("Average: " + evenStats.average());
        System.out.println("\nOdd");
        System.out.println("Count: " + oddStats.getCount());
        System.out.println("Sum: " + oddStats.getSum());
        System.out.println("Average: " + oddStats.average());
    }
}
