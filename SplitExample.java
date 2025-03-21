 import java.util.StringTokenizer;

public class SplitExample {

    public static void usingSplit() {
        String str = "apple,orange;banana:grape";
        String[] tokens = str.split("[,;:]"); // Multiple delimiters using regex

        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public static void usingTokenizer() {
        String data = "apple,orange;banana:grape";

        // Using multiple delimiters: comma, semicolon, and colon
        StringTokenizer tokenizer = new StringTokenizer(data, ",;:");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }

    public static void main(String[] args) {
        usingSplit();
        usingTokenizer();
    }

}

