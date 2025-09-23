package bridgeLabz.String_extra;
public class CompareStrings {
    static void compare(String a, String b) {
        int min = Math.min(a.length(), b.length());
        for (int i = 0; i < min; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (a.charAt(i) < b.charAt(i))
                    System.out.println(a + " comes before " + b);
                else
                    System.out.println(b + " comes before " + a);
                return;
            }
        }
        if (a.length() == b.length()) System.out.println("Both are equal");
        else if (a.length() < b.length()) System.out.println(a + " comes before " + b);
        else System.out.println(b + " comes before " + a);
    }
    public static void main(String[] args) {
        compare("apple", "banana");
    }
}
