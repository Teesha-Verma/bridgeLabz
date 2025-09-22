package bridgeLabz.strings;
import java.util.Scanner;

public class SubstringComparison {
    public static String substringCharAt(String s, int start, int end) {
        String result = "";
        for(int i=start;i<end;i++) result += s.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = substringCharAt(text,start,end);
        String sub2 = text.substring(start,end);

        System.out.println("Substring using charAt(): "+sub1);
        System.out.println("Substring using substring(): "+sub2);
        System.out.println("Both substrings are equal? "+sub1.equals(sub2));
        sc.close();
    }
}
