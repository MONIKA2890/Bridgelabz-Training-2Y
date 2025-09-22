
import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate; // per day

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber; this.type = type; this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    protected double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println(type + " (" + vehicleNumber + ") Rate/day: " + rentalRate);
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNo; // sensitive
    public Car(String num, double rate, String policyNo) { super(num,"Car",rate); this.insurancePolicyNo = policyNo; }
    @Override public double calculateRentalCost(int days) { return getRentalRate()*days + 50*days; } // cleaning fee
    @Override public double calculateInsurance() { return 1000; }
    @Override public String getInsuranceDetails() { return "Policy: ****" + insurancePolicyNo.substring(insurancePolicyNo.length()-4); }
}

class Bike extends Vehicle {
    public Bike(String num, double rate) { super(num,"Bike",rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate()*days; }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNo;
    public Truck(String num, double rate, String policyNo) { super(num,"Truck",rate); this.insurancePolicyNo = policyNo; }
    @Override public double calculateRentalCost(int days) { return getRentalRate()*days + 200*days; } // heavier fee
    @Override public double calculateInsurance() { return 2500; }
    @Override public String getInsuranceDetails() { return "Policy: ****" + insurancePolicyNo.substring(insurancePolicyNo.length()-4); }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> fleet = Arrays.asList(
            new Car("KA01AB1234",2000,"CPOL123456"),
            new Bike("KA02XY9999",500),
            new Truck("KA03TR0001",4000,"TPOL987654")
        );
        for (Vehicle v : fleet) {
            v.displayDetails();
            System.out.println("3-day rental cost: " + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable)v;
                System.out.println("Insurance: " + ins.calculateInsurance() + ", " + ins.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}

