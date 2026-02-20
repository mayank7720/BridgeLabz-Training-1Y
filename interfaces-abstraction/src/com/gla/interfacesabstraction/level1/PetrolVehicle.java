package com.gla.interfacesabstraction.level1;

public class PetrolVehicle implements VehicleDashboard {
    @Override
    public void displaySpeed(int speed) {
        System.out.println("Petrol vehicle speed: " + speed + " km/h");
    }
}
