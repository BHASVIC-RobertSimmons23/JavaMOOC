package Part5.ComparingApartmentsExercise;

public class Apartment {
    private final int rooms;
    private final int squares;
    private final int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment apartment2) {
        return this.squares > apartment2.squares;
    }

    public int priceDifference(Apartment apartment2) {
        return Math.abs(this.squares * this.pricePerSquare - apartment2.squares * apartment2.pricePerSquare);
    }

    public boolean moreExpensiveThan(Apartment apartment2) {
        return this.squares * pricePerSquare > apartment2.squares * apartment2.pricePerSquare;
    }
}
