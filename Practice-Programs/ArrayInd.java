import java.util.Arrays;

public class ArrayInd {
    public static void main(String[] args) {
        // Integer array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Integer Array: " + Arrays.toString(numbers));
        
        // String array
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println("String Array: " + Arrays.toString(fruits));
        
        // Double array
        double[] prices = {10.5, 20.3, 15.8, 25.0};
        System.out.println("Double Array: " + Arrays.toString(prices));
        
        // Boolean array
        boolean[] flags = {true, false};
        System.out.println("Boolean Array: " + Arrays.toString(flags));
    }
}