package com.gla.interfacesabstraction.level1;

public class CarRental implements VehicleRental {
    @Override
    public void rent() {
        System.out.println("Car rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car returned");
    }
}
