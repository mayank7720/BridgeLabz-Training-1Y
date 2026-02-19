public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Basics");
        sb.insert(4, " Programming");
        sb.delete(4, 16);
        sb.reverse();

        System.out.println("Result: " + sb);
    }
}
