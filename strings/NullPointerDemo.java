package bridgeLabz.strings;
public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This throws NullPointerException
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch(NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }

    public static void main(String[] args) {
        //generateException(); // Uncomment to see abrupt stop
        handleException();
    }
}
