package bridgeLabz.assign1;
import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(CartItem item) {
        items.add(item);
    }

    void removeItem(String name) {
        items.removeIf(i -> i.itemName.equalsIgnoreCase(name));
    }

    void displayTotal() {
        double sum = 0;
        for (CartItem i : items) sum += i.totalCost();
        System.out.println("Total Cart Cost: ₹" + sum);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Pen", 10, 3));
        cart.addItem(new CartItem("Book", 50, 2));
        cart.displayTotal();
        cart.removeItem("Pen");
        cart.displayTotal();
    }
}
