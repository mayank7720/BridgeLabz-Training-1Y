import java.util.*;
public class KilometerstoMiles {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
       
System.out.println("Enter value in Kilometer");
int Kilometers = sc.nextInt();
		
double Miles = Kilometers * 0.621371;
      
System.out.println("Value in Miles is : " + Miles);

sc.close();
        
}
}
