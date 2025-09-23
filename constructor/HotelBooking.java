package bridgeLabz.constructor;
public class HotelBooking {
    String guestName, roomType;
    int nights;

    HotelBooking() { this("Guest","Standard",1); }
    HotelBooking(String g, String r, int n) {
        guestName=g; roomType=r; nights=n;
    }
    HotelBooking(HotelBooking hb) {
        this(hb.guestName, hb.roomType, hb.nights);
    }
    void display() {
        System.out.println(guestName+" booked "+roomType+" for "+nights+" nights.");
    }
    public static void main(String[] args) {
        HotelBooking h1=new HotelBooking();
        HotelBooking h2=new HotelBooking("Amit","Deluxe",3);
        HotelBooking h3=new HotelBooking(h2);
        h1.display(); h2.display(); h3.display();
    }
}
