package bridgeLabz.constructor;
public class CarRental {
    String customerName, carModel;
    int rentalDays;
    static final double RATE_PER_DAY = 1000.0;

    CarRental(String name,String model,int days){
        customerName=name; carModel=model; rentalDays=days;
    }
    double totalCost(){ return rentalDays * RATE_PER_DAY; }

    public static void main(String[] args){
        CarRental c = new CarRental("Riya","Sedan",5);
        System.out.println("Total cost: ₹" + c.totalCost());
    }
}
