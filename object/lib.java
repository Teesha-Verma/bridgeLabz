package bridgeLabz.object;
import java.util.*;

class Book {
    String title, author;
    Book(String t, String a){ title=t; author=a; }
    public String toString(){ return title + " by " + author; }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();
    Library(String n){ name = n; }
    void addBook(Book b){ books.add(b); }
    void showBooks(){
        System.out.println("Library: " + name);
        for(Book b: books) System.out.println(" - " + b);
    }
    public static void main(String[] args){
        Book b1 = new Book("1984","Orwell");
        Book b2 = new Book("Java Basics","Alice");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("Campus Library");

        lib1.addBook(b1);        // same book can be in many libraries
        lib2.addBook(b1);
        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}
