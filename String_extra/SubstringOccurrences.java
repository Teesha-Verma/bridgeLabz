package bridgeLabz.String_extra;
public class SubstringOccurrences {
    static int count(String text, String sub) {
        int count = 0;
        for (int i = 0; i <= text.length() - sub.length(); i++)
            if (text.substring(i, i + sub.length()).equals(sub)) count++;
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count("banana", "ana")); // 1
    }
}
