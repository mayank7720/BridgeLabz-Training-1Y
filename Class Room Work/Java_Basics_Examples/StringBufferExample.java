public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        sb.insert(5, " Students");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 11);
        sb.reverse();

        System.out.println("Result: " + sb);
        System.out.println("Capacity: " + sb.capacity());
    }
}
