package Part3;

public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public  static void printArrayInStars(int[] array) {
        for (int num : array) System.out.println("*".repeat(num));
    }
}
