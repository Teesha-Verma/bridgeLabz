package bridgeLabz.methods;
import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km = 5000 meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1 (m): ");
        double a = sc.nextDouble();
        System.out.print("Enter side2 (m): ");
        double b = sc.nextDouble();
        System.out.print("Enter side3 (m): ");
        double c = sc.nextDouble();

        System.out.println("Number of rounds to complete 5 km: " + calculateRounds(a, b, c));
        sc.close();
    }
}
