package bridgeLabz.methods;
import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int num, int divisor) {
        int quotient = num / divisor;
        int remainder = num % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
        sc.close();
    }
}
