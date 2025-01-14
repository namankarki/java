// Definition of the Person class
class Person {
    private String name;
    private int age;
    private String gender;

    // Constructor to initialize the attributes
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println();
    }
}

// Main class to test the Person class
public class PersonDemo {
    public static void main(String[] args) {
        // Create two instances of the Person class
        Person person1 = new Person("Prajina", 25, "Female");
        Person person2 = new Person("Naman", 23, "Male");

        // Display the details of both instances
        System.out.println("Details of Person 1:");
        person1.displayDetails();

        System.out.println("Details of Person 2:");
        person2.displayDetails();
    }
}

