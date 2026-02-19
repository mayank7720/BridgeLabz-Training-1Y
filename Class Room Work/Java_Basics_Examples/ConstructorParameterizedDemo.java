public class ConstructorParameterizedDemo {
    String name;
    int age;

    public ConstructorParameterizedDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorParameterizedDemo student = new ConstructorParameterizedDemo("Anita", 21);
        student.display();
    }
}
