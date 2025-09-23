package bridgeLabz.String_extra;
import java.util.Scanner;

public class CountVowelsConsonants {
    static void count(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        count(sc.nextLine());

        sc.close();
    }
}
