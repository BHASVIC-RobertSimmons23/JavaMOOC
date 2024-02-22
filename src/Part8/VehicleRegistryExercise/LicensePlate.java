package Part8.VehicleRegistryExercise;

import Part5.BookExercise.Book;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if(this == comparedObject) return true;
        if(!(comparedObject instanceof LicensePlate comparedPlate)) return false;
        return this.liNumber.equals(comparedPlate.liNumber) && this.country.equals(comparedPlate.country);

    }

    @Override
    public int hashCode() {
        return liNumber.hashCode() + country.hashCode();
    }
}