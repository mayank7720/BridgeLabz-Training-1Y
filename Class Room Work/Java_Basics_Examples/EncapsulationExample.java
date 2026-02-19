public class EncapsulationExample {
    public static void main(String[] args) {
        StudentData student = new StudentData();
        student.setRollNo(1);
        student.setName("Priya");

        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Name: " + student.getName());
    }
}
