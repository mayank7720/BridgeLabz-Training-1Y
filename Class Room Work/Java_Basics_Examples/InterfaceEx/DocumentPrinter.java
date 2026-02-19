package InterfaceEx;

public class DocumentPrinter implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}
