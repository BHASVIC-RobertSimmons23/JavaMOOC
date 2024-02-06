package Part5.CardPaymentsExercise;

public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double increase) {
        balance += increase;
    }

    public boolean takeMoney(double amount) {
        if(balance < amount) return false;
        balance -= amount;
        return true;
    }
}
