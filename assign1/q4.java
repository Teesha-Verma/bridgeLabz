package bridgeLabz.assign1;
class Item {
    String itemCode;
    String itemName;
    double price;

    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    void display() {
        System.out.println(itemCode + " - " + itemName + " @₹" + price);
    }

    public static void main(String[] args) {
        Item i = new Item("I101", "Notebook", 45);
        i.display();
        System.out.println("Total for 10 qty: ₹" + i.totalCost(10));
    }
}
