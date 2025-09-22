package bridgeLabz.strings;
import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String s) {
        System.out.println(s.substring(5,2));
    }

    public static void handleException(String s) {
        try {
            System.out.println(s.substring(5,2));
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Caught IllegalArgumentException via substring indices");
        } catch(Exception e) {
            System.out.println("Caught Exception: "+e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        //generateException(text);
        handleException(text);
        sc.close();
    }
}
