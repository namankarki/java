// Define the Drawable interface
interface Drawable {
    void draw();
}

// Implement the Drawable interface in Circle class
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Implement the Drawable interface in Square class
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Main class to demonstrate the functionality
public class DrawableDemo {
    public static void main(String[] args) {
        // Create an array of Drawable objects
        Drawable[] shapes = new Drawable[2];
        shapes[0] = new Circle(); // Add a Circle
        shapes[1] = new Square(); // Add a Square

        // Invoke the draw() method for each object
        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}
