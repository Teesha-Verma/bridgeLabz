package bridgeLabz.functions;
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.next();
        sc.close();

        LocalDate date = LocalDate.parse(input);
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("After Adding/Subtracting: " + result);
    }
}
