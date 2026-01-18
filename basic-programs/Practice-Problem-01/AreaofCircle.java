import java.util.*;
public class AreaofCircle{
public static void main(){

Scanner sc = new Scanner(System.in);
System.out.println("Enter radius");
int radius = sc.nextInt();

        
double area = Math.PI * radius * radius;
        

 
System.out.println("Area of Circle is : " + area);

sc.close();
}
}
