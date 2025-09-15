package bridgeLabz.assign1;
class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " by " + author + " costs ₹" + price);
    }

    public static void main(String[] args) {
        Book b = new Book("The Alchemist", "Paulo Coelho", 499);
        b.display();
    }
}
