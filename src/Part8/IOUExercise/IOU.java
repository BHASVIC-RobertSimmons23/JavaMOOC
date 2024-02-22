package Part8.IOUExercise;

import java.util.HashMap;

public class IOU {
    private final HashMap<String, Double> map = new HashMap<>();
    public void setSum(String recipient, double amount) {
        map.put(recipient, amount);
    }

    public double howMuchDoIOweTo(String recipient) {
        if(map.containsKey(recipient)) return map.get(recipient);
        return 0;
    }
}
