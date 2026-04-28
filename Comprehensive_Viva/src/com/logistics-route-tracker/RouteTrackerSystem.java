public class RouteTrackerSystem {
    public static void main(String[] args) {

        Driver driver = new Driver("D1204", "Kavita Nair");

        DeliveryCheckpoint cp1 = new DeliveryCheckpoint(
                "CP01", "Warehouse A", 30.0, 40, 50);

        FuelCheckpoint cp2 = new FuelCheckpoint(
                "CP02", "Pump 12", 25.0, 15, 10);

        RestCheckpoint cp3 = new RestCheckpoint(
                "CP03", "Motel X", 20.0, 30, 65);

        DeliveryCheckpoint cp4 = new DeliveryCheckpoint(
                "CP04", "Client Hub", 45.0, 60, 75);

        driver.routeHistory.addCheckpoint(cp1);
        driver.routeHistory.addCheckpoint(cp2);
        driver.routeHistory.addCheckpoint(cp3);
        driver.routeHistory.addCheckpoint(cp4);

        driver.showSummary();

        System.out.println("\n--- Find Checkpoint CP02 ---");
        Checkpoint found = driver.routeHistory.findCheckpoint("CP02");
        if (found != null) {
            System.out.println("Found: " + found.getType() + "Checkpoint - " + found.locationName);
        } else {
            System.out.println("Checkpoint not found.");
        }

        System.out.println("\n--- Remove Checkpoint CP03 ---");
        boolean removed = driver.routeHistory.removeCheckpoint("CP03");
        System.out.println("Removed: " + removed);

        System.out.println("\n--- Updated Route ---");
        driver.showSummary();
    }
}
