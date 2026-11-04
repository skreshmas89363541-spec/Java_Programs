
abstract class Shape {
    abstract double calculateArea();
}

// Subclass for Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    private double length;
    private double breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

// Subclass for Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Subclass for Square
class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

// Main class
public class Abstract {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        System.out.println("Circle Area: " + s.calculateArea());

        s = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + s.calculateArea());

        s = new Triangle(8, 6);
        System.out.println("Triangle Area: " + s.calculateArea());

        s = new Square(4);
        System.out.println("Square Area: " + s.calculateArea());
    }
}