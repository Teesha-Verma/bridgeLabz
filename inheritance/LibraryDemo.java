package bridgeLabz.inheritance;
class Book {
    String title; int publicationYear;
    Book(String t,int y){ title=t; publicationYear=y; }
}

class Author extends Book {
    String name, bio;
    Author(String t,int y,String n,String b){
        super(t,y); name=n; bio=b;
    }
    void displayInfo(){
        System.out.println("Book: "+title+" ("+publicationYear+")");
        System.out.println("Author: "+name+" - "+bio);
    }
}

public class LibraryDemo {
    public static void main(String[] args){
        Author a = new Author("The Guide",1958,"R.K. Narayan","Famous Indian novelist");
        a.displayInfo();
    }
}
