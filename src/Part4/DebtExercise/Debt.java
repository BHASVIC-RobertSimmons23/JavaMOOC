package Part4.DebtExercise;

public class Debt {
    private double balance;
    private final double interestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        balance = initialBalance;
        interestRate = initialInterestRate;
    }
    public void printBalance() {
        System.out.println("Balance: " + balance);
    }

    public void waitOneYear() {
        balance *= interestRate;
    }
}
