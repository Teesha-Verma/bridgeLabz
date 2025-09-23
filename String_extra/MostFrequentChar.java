package bridgeLabz.String_extra;
public class MostFrequentChar {
    static char mostFrequent(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        int max = 0; char ans = ' ';
        for (char c : s.toCharArray())
            if (freq[c] > max) { max = freq[c]; ans = c; }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(mostFrequent("success"));
    }
}
