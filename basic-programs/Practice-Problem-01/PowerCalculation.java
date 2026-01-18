import java.util.*;
public class PowerCalculation{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter value of base");
double base = sc.nextDouble();

System.out.print("Enter value for exponent");
double exponent = sc.nextDouble();

double result = Math.pow(base,exponent);

System.out.print("Result is :" + result);

sc.close();
}
}