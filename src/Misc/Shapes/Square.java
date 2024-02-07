package Misc.Shapes;

public class Square {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getArea() {
        return length * length;
    }

    public int getPerimeter() {
        return length * 4;
    }
}
