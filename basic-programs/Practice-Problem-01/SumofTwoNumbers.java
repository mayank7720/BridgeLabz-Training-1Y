import java.util.*;
public class SumofTwoNumbers {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter value for a");
int a = sc.nextInt();

System.out.print("Enter value for b");
int b = sc.nextInt();
      
int sum = a+b;
    
System.out.println("Sum of two no is :" + sum);

sc.close();
}
}