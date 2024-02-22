package Part8.VehicleRegistryExercise;

import java.sql.ClientInfoStatus;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class VehicleRegistry {
    private  HashMap<LicensePlate, String> plateMap = new HashMap<>();
    public boolean add(LicensePlate licensePlate, String owner) {
        if(plateMap.containsKey(licensePlate)) return false;
        plateMap.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return plateMap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if(!plateMap.containsKey(licensePlate)) return false;
        plateMap.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for(LicensePlate plate: plateMap.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        for(String owner: new HashSet<>(plateMap.values())) {
            System.out.println(owner);
        }
    }
}
