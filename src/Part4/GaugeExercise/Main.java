package Part4.GaugeExercise;

public class Main {
    public static void main(String[] args) {
        Gauge g = new Gauge();
        while(!g.full()) {
            System.out.println("Not full! Value: " + g.getValue());
            g.increase();
        }

        System.out.println("Full! Value: " + g.getValue());
        g.decrease();
        System.out.println("Not full! Values: " + g.getValue());
    }
}
