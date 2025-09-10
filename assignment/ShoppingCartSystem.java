package bridgeLabz.assignment;
class Product {
    static double discount = 10.0; // default 10%
    private String productName;
    private double price;
    private int quantity;
    private final int productID; // final variable - unique and immutable
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID; // final variable initialized here
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
            System.out.println("Discount updated to: " + discount + "%");
        } else {
            System.out.println("Invalid discount value.");
        }
    }
    public double getFinalPrice() {
        return (price * quantity) * (1 - discount / 100);
    }
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("----- Product Details -----");
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + getFinalPrice());
        } else {
            System.out.println("Not a valid Product object.");
        }
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 800, 1);
        Product p2 = new Product(202, "Headphones", 50, 2);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.updateDiscount(20);
        p1.displayProductDetails();
        p2.displayProductDetails();
        if (p2 instanceof Product) {
            System.out.println("p2 is a valid Product object.");
        }
    }
}