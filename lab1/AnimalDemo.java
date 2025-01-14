// Abstract class Animal
abstract class Animal {
    // Abstract methods
    abstract void makeSound();
    abstract void move();
}

// Subclass Dog extends Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog: Woof Woof");
    }

    @Override
    void move() {
        System.out.println("Dog: Running");
    }
}

// Subclass Bird extends Animal
class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird: Chirp Chirp");
    }

    @Override
    void move() {
        System.out.println("Bird: Flying");
    }
}

// Main class to demonstrate the usage
public class AnimalDemo {
    public static void main(String[] args) {
        // Create instances of Dog and Bird
        Animal dog = new Dog();
        Animal bird = new Bird();

        // Demonstrate the functionality of Dog
        System.out.println("Dog:");
        dog.makeSound();
        dog.move();

        // Demonstrate the functionality of Bird
        System.out.println("\nBird:");
        bird.makeSound();
        bird.move();
    }
}

