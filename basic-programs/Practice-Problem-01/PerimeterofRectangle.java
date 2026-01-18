import java.util.*;
public class PerimeterofRectangle {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
System.out.println("Enter length");
int length = sc.nextInt();

System.out.println("Enter length");
int breadth = sc.nextInt();

int Perimeter = 2 * (length + breadth);
System.out.println("Perimeter of rectangle is : " + Perimeter);
sc.close();
}

}
