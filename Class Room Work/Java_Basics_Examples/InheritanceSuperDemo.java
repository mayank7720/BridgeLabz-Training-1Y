public class InheritanceSuperDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Arun", 45000.0);
        employee.showDetails();
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}
