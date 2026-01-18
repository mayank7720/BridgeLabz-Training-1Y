import java.util.*;

public class TriangleArea {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter base in cm: ");
double base = sc.nextDouble();

System.out.print("Enter height in cm: ");
double height = sc.nextDouble();

double areaofSqinCm = 0.5 * base * height;

double areaofSqinIn = areaofSqinCm / 6.4516;

System.out.println("The Area of the triangle in sq in is " + areaofSqinIn +" and sq cm is " + areaofSqinCm);
sc.close();
}
}
