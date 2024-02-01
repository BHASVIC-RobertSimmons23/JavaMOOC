package Part4.WhistleExercise;

public class Whistle {
    private final String sound;
    public Whistle(String soundName) {
        sound = soundName;
    }

    public void printSound() {
        System.out.println(sound);
    }
}
