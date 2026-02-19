public class LoopExampleDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            System.out.println("while: " + i);
            i++;
        }

        int j = 1;
        do {
            System.out.println("do-while: " + j);
            j++;
        } while (j <= 3);

        for (int k = 1; k <= 3; k++) {
            System.out.println("for: " + k);
        }

        int[] arr = {10, 20, 30};
        for (int value : arr) {
            System.out.println("for-each: " + value);
        }

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
