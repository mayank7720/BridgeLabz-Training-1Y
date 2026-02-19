package Interface;

public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord("Kiran");
        if (student instanceof Marker) {
            System.out.println("StudentRecord is marked by Marker interface.");
        }
    }
}
