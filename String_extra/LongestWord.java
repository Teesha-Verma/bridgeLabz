package bridgeLabz.String_extra;
public class LongestWord {
    static String findLongest(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String w : words)
            if (w.length() > longest.length()) longest = w;
        return longest;
    }
    public static void main(String[] args) {
        System.out.println(findLongest("Java makes coding fun"));
    }
}
