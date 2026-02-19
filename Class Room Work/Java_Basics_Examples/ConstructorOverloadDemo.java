public class ConstructorOverloadDemo {
    int id;
    String name;

    public ConstructorOverloadDemo() {
        this(0, "Default");
    }

    public ConstructorOverloadDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Id: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloadDemo a = new ConstructorOverloadDemo();
        ConstructorOverloadDemo b = new ConstructorOverloadDemo(101, "Meena");
        a.display();
        b.display();
    }
}
