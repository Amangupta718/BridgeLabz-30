// Employee Class
public class Employee {
    // Private Fields
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to Display Employee Details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Main Method
    public static void main(String[] args) {
        // Create Employee Object
        Employee emp1 = new Employee("Dil", 001, 7000.0);
        emp1.displayDetails();
    }
}
