package Part4.WhistleExercise;

public class Main {
    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.printSound();
        roosterWhistle.printSound();
        duckWhistle.printSound();
    }
}
