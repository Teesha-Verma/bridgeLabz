package bridgeLabz.constructor;
public class LibraryBook {
    String title, author;
    double price;
    boolean available = true;

    LibraryBook(String t,String a,double p){
        title=t; author=a; price=p;
    }
    void borrow() {
        if(available){ available=false; System.out.println("Borrowed: "+title); }
        else System.out.println("Already borrowed");
    }
}
