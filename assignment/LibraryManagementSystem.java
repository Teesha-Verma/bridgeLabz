package bridgeLabz.assignment;
class Book {
    static String libraryName = "City Central Library";
    private String title;
    private String author;
    private final String isbn; // final variable (unique identifier)
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn; // final variable initialized here
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("----- Book Details -----");
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Not a valid Book object.");
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Display library name
        Book.displayLibraryName();
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN001");
        Book b2 = new Book("1984", "George Orwell", "ISBN002");
        b1.displayBookDetails();
        b2.displayBookDetails();
        if (b1 instanceof Book) {
            System.out.println("b1 is indeed a Book object.");
        }
    }
}