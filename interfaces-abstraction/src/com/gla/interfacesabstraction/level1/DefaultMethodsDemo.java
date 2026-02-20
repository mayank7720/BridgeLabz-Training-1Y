package com.gla.interfacesabstraction.level1;

public class DefaultMethodsDemo {
    public static void run() {
        PaymentProcessor razorpay = new RazorpayProcessor();
        PaymentProcessor stripe = new StripeProcessor();
        razorpay.processPayment(1800);
        stripe.processPayment(2200);
        razorpay.refund(400);

        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();
        System.out.println(csv.export("report_data"));
        System.out.println(pdf.export("report_data"));
        System.out.println(csv.exportToJSON("report_data"));

        VehicleDashboard petrol = new PetrolVehicle();
        VehicleDashboard electric = new ElectricVehicle(82);
        petrol.displaySpeed(78);
        petrol.displayBatteryPercentage();
        electric.displaySpeed(96);
        electric.displayBatteryPercentage();
    }
}
