package bridgeLabz.array;
import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0)
                    System.out.println(numbers[i] + " is positive and even");
                else
                    System.out.println(numbers[i] + " is positive and odd");
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            } else {
                System.out.println(numbers[i] + " is zero");
            }
        }
        if (numbers[0] == numbers[4])
            System.out.println("First and last numbers are equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First number is greater than last number");
        else
            System.out.println("First number is less than last number");
    }
}
