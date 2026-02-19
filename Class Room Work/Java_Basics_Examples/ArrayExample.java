import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements:");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();

        numbers[2] = 99;
        System.out.println("After update at index 2:");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        int target = scanner.nextInt();
        boolean found = false;

        for (int value : numbers) {
            if (value == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        scanner.close();
    }
}
