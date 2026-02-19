package InterfaceEx;

public interface SmartDevice {
    default void start() {
        log("Device started");
        System.out.println("SmartDevice is running");
    }

    private void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
