package Misc.Shapes;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Square, Area: " + square.getArea() + " Perimeter: " + square.getPerimeter());
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle, Area: " + rectangle.getArea() + " Perimeter: " + rectangle.getPerimeter());
        Circle circle = new Circle(5);
        System.out.println("Circle, Area " + rectangle.getArea() + " Circumference: " + circle.getCircumference());
        Hexagon hexagon = new Hexagon(6);
        System.out.println("Hexagon, Area: " + hexagon.getArea());
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle, Area: " + triangle.getArea());
        NPointPolygon testPolygon = new NPointPolygon(new Vec2(3, 1), new Vec2(7, 2), new Vec2(4, 4), new Vec2(8, 6), new Vec2(1, 7));
        System.out.println("Test Polygon, Area: " + testPolygon.getArea());
    }
}
