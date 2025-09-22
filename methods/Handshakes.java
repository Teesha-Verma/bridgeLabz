package bridgeLabz.methods;
import java.util.Scanner;

public class Handshakes {
    public static int maxHandshakes(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.println("Maximum number of handshakes: " + maxHandshakes(students));
        sc.close();
    }
}
