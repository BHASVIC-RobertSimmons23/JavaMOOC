package Part8.VehicleRegistryExercise;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        VehicleRegistry registry = new VehicleRegistry();
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        System.out.println(registry.add(li1, "John"));
        System.out.println(registry.add(li1, "Steve"));
        System.out.println(registry.add(li2, "David"));
        System.out.println(registry.add(li3, "David"));
        registry.printLicensePlates();
        registry.printOwners();

        System.out.println(registry.remove(li1));
        System.out.println(registry.remove(li1));

        System.out.println(registry.get(li2));
    }
}
