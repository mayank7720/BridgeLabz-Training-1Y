import java.util.*;
public class AverageofThreeno {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
      
System.out.println("Enter value for a");
int a = sc.nextInt();
       
System.out.println("Enter value for b");
int b = sc.nextInt();
        
System.out.println("Enter value for c");
int c = sc.nextInt();

int avg = (a + b + c) / 3;
System.out.println("Average of Three no is : "+ avg);

sc.close();
        
}
}
