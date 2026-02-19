import java.util.Arrays;

public class ArraysMethodExample {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 3};
        int[] b = {1, 2, 3, 4, 5};
        int[] c = {1, 2, 3, 4, 5};

        Arrays.sort(a);
        System.out.println("Sorted a: " + Arrays.toString(a));

        int index = Arrays.binarySearch(a, 3);
        System.out.println("Index of 3 in a: " + index);

        boolean equalsResult = Arrays.equals(b, c);
        System.out.println("b equals c: " + equalsResult);

        Arrays.fill(c, 7);
        System.out.println("c after fill: " + Arrays.toString(c));
    }
}
