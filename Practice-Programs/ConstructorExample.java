public class ConstructorExample {

    int id;
    int age;
    String name;

    public ConstructorExample() {
        System.out.println("Constructor Program");

    }

    public ConstructorExample(int id , String name , int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    
    void display() {
        System.out.println(" id = " + id +  " name = " + name + " age = " + age);
    }

    public static void main(String[] args) {

        ConstructorExample co = new ConstructorExample(1, "Raj" ,25 );
        System.out.println(co);
        co.display(); 
        
    }  
}