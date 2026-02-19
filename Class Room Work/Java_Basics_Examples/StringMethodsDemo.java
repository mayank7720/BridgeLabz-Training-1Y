public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "Hello Java";

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring (0,5): " + text.substring(0, 5));
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Replace Java->World: " + text.replace("Java", "World"));
    }
}
