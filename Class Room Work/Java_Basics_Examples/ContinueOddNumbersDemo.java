import java.util.Scanner;

public class ContinueOddNumbersDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        scanner.close();
    }
}
