package bridgeLabz.String_extra;
import java.util.*;

public class ReverseString {
    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverse(sc.nextLine()));

        sc.close();
    }
}
