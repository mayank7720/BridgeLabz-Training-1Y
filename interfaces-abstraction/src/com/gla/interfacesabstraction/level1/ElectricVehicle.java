package com.gla.interfacesabstraction.level1;

public class ElectricVehicle implements VehicleDashboard {
    private final int batteryPercentage;

    public ElectricVehicle(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Electric vehicle speed: " + speed + " km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery percentage: " + batteryPercentage + "%");
    }
}
