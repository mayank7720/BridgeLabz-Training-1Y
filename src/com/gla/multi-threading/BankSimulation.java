class BankAccount implements Runnable {
    private String name;
    private String type;

    public BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + " (" + type + ") is checking balance | Priority: "
                        + Thread.currentThread().getPriority());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        Thread t1 = new Thread(new BankAccount("User1", "Premium"));
        Thread t2 = new Thread(new BankAccount("User2", "Regular"));
        Thread t3 = new Thread(new BankAccount("User3", "Basic"));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
