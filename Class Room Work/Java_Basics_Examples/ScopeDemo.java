public class ScopeDemo {
    static int staticVar = 100;
    int instanceVar = 200;

    public void m1() {
        int localM1 = 10;
        System.out.println("m1 local: " + localM1);
        System.out.println("m1 static: " + staticVar);
        System.out.println("m1 instance: " + instanceVar);
    }

    public void m2() {
        int localM2 = 20;
        System.out.println("m2 local: " + localM2);
        System.out.println("m2 static: " + staticVar);
        System.out.println("m2 instance: " + instanceVar);
    }

    public static void main(String[] args) {
        int localMain = 30;
        ScopeDemo demo = new ScopeDemo();
        System.out.println("main local: " + localMain);
        System.out.println("main static: " + staticVar);
        System.out.println("main instance: " + demo.instanceVar);
        demo.m1();
        demo.m2();
    }
}
