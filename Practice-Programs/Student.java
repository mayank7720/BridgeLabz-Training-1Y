import java.util.Scanner;

class Student {

int id;
int age;
String name;


void displayDetails() {

String status = "Active";	
	
System.out.println("Students ID: " + id);
System.out.println("Students Age: " + age);
System.out.println("Students Name: " + name);
}

public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);	

Student s1 = new Student();

System.out.println("Enter Students Id: ");
s1.id = sc.nextInt();
System.out.println("Enter Students Age: ");
s1.age = sc.nextInt();
System.out.println("Enter Students Name: ");
s1.name = sc.next();

s1.displayDetails();
}
}


