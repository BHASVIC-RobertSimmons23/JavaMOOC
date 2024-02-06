package Part5.CardPaymentsExercise;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if(payment < 2.5) return payment;
        affordableMeals++;
        money += 2.5;
        return payment - 2.5;
    }

    public boolean eatAffordably(PaymentCard card) {
        if(!card.takeMoney(2.5)) return false;
        affordableMeals++;
        return true;
    }

    public double eatHeartily(double payment) {
        if(payment < 4.3) return payment;
        heartyMeals++;
        money += 4.3;
        return payment - 4.3;
    }

    public boolean eatHeartily(PaymentCard card) {
        if(!card.takeMoney(4.3)) return false;
        heartyMeals++;
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double amount) {
        card.addMoney(amount);
        money += amount;
    }

    public String toString() {
        return "Money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
