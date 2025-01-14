// Base class: Shape
abstract class Shape {
    // Abstract methods for calculating area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Derived class: Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea() for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of calculatePerimeter() for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea() for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementation of calculatePerimeter() for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class to demonstrate the usage of Shape, Circle, and Rectangle
public class ShapeDemo {
    public static void main(String[] args) {
        // Create a Circle object
        Shape circle = new Circle(5); // Radius = 5
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Create a Rectangle object
        Shape rectangle = new Rectangle(4, 7); // Length = 4, Width = 7
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}

