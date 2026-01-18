import java.util.*;

public class KilometerToMiles {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter Kilometer");
double Kilometer = sc.nextInt();

double Miles = Kilometer / 1.6;

System.out.println("The total miles is " + Miles + " mile for the given " + Kilometer + " km");

sc.close();
}
}
