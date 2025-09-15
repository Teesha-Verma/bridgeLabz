package bridgeLabz.assign1;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    void display() {
        System.out.println("Movie: " + movieName +
                           ", Seat: " + seatNumber +
                           ", Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.bookTicket("Inception", 12, 250);
        t.display();
    }
}
