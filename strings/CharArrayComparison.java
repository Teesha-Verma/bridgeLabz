package bridgeLabz.strings;
import java.util.Scanner;

public class CharArrayComparison {
    public static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++) arr[i] = s.charAt(i);
        return arr;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if(a.length != b.length) return false;
        for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] arr1 = getChars(text);
        char[] arr2 = text.toCharArray();

        System.out.println("User-defined method equals to toCharArray()? " + compareCharArrays(arr1, arr2));
        sc.close();
    }
}
