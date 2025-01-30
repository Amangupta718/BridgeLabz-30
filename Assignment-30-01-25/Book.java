// Book Class
public class Book {
    // Private Fields
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to Display Book Details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main Method
    public static void main(String[] args) {
        // Create Book Object
        Book book1 = new Book("Java", "james gosling", 50.00);
        book1.displayDetails();
    }
}
