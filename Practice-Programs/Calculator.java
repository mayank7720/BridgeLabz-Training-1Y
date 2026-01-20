import java.util.*;

class Calculator{

int Addition(int a, int b){
return a + b;
}

int Subtraction(int a, int b){
return a - b;
}

double Multiplication(double a, double b){
return a * b;
}

int Division(int a, int b){
return a / b;
}

int Modulus(int a, int b){
return a % b;
}

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the value for a");
int a = sc.nextInt();

System.out.println("Enter the value for b");
int b = sc.nextInt();

Calculator calc = new Calculator();

System.out.println("Addition : " + calc.Addition(a,b));

System.out.println("Subtraction : " + calc.Subtraction(a,b));

System.out.println("Multiplication : " +  calc.Multiplication(a,b));

System.out.println("Division : " + calc.Division(a,b));

System.out.println("Modulus : " + calc.Modulus(a,b));

sc.close();
}
}