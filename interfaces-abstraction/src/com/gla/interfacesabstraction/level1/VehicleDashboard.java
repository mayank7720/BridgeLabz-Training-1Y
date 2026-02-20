package com.gla.interfacesabstraction.level1;

public interface VehicleDashboard {
    void displaySpeed(int speed);

    default void displayBatteryPercentage() {
        System.out.println("Battery percentage not available");
    }
}
