public class ConstructorChainingStudentDemo {
    String name;
    int age;

    public ConstructorChainingStudentDemo() {
        this("Unknown", 0);
    }

    public ConstructorChainingStudentDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorChainingStudentDemo s1 = new ConstructorChainingStudentDemo();
        ConstructorChainingStudentDemo s2 = new ConstructorChainingStudentDemo("Rahul", 22);
        s1.display();
        s2.display();
    }
}
