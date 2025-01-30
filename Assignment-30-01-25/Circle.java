// Circle Class
public class Circle {
    // Private Field
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to Calculate Area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to Calculate Circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to Display Details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Main Method
    public static void main(String[] args) {
        // Create Circle Object
        Circle circle1 = new Circle(10.0);
        circle1.displayDetails();
    }
}
