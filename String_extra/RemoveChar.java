package bridgeLabz.String_extra;
public class RemoveChar {
    static String removeChar(String s, char ch) {
        String result = "";
        for (char c : s.toCharArray())
            if (c != ch) result += c;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(removeChar("Hello World", 'l'));
    }
}
