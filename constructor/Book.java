package bridgeLabz.constructor;
public class Book {
    String title;
    String author;
    double price;

    // default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    // parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void display() {
        System.out.println(title + " by " + author + " : ₹" + price);
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics","Alice",299);
        b1.display();  b2.display();
    }
}
