package com.gla.interfacesabstraction.level1;

public class InterfaceExamplesDemo {
    public static void run() {
        SmartDevice light = new Light();
        SmartDevice ac = new AirConditioner();
        SmartDevice tv = new Television();
        light.turnOn();
        ac.turnOn();
        tv.turnOn();
        light.turnOff();
        ac.turnOff();
        tv.turnOff();

        VehicleRental car = new CarRental();
        VehicleRental bike = new BikeRental();
        VehicleRental bus = new BusRental();
        car.rent();
        bike.rent();
        bus.rent();
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();

        DigitalPayment upi = new UPIPayment();
        DigitalPayment card = new CreditCardPayment();
        DigitalPayment wallet = new WalletPayment();
        upi.pay(500);
        card.pay(1200);
        wallet.pay(250);
    }
}
