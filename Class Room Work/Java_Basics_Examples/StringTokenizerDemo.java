import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String sentence = "Java is simple and powerful";
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
