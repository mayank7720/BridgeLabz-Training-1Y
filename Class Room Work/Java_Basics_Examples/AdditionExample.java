public class AdditionExample {
    int x = 10;
    int y = 20;

    public int addNonStatic() {
        return x + y;
    }

    public static int addStatic(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        AdditionExample demo = new AdditionExample();
        System.out.println("Non-static add: " + demo.addNonStatic());
        System.out.println("Static add: " + addStatic(30, 40));
    }
}
