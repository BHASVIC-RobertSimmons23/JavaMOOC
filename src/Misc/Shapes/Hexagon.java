package Misc.Shapes;

public class Hexagon {
    private double sideLength;

    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return 0.5 * (3 * Math.sqrt(3) * sideLength * sideLength);
    }
}
