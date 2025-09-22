package bridgeLabz.basic;
public class Prog4Profit {
    public static void main(String[] args) {
        double cost = 129, sell = 191;
        double profit = sell - cost;
        double percent = profit / cost * 100;
        System.out.println(
            "The Cost Price is INR " + cost + " and Selling Price is INR " + sell + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + percent
        );
    }
}
