package Interface;

public class LambdaTest {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        System.out.println("Sum: " + calculator.add(5, 7));
    }
}
