
import java.util.*;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId; this.driverName = driverName; this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    protected double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println(getVehicleId() + " - " + getDriverName() + " Rate/km: " + getRatePerKm());
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}

class CarVehicle extends Vehicle implements GPS {
    private String location = "Unknown";
    public CarVehicle(String id, String driver, double rate) { super(id,driver,rate); }
    @Override public double calculateFare(double distance) { return getRatePerKm()*distance + 50; } // base charge
    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }
}

class BikeVehicle extends Vehicle implements GPS {
    private String location = "Unknown";
    public BikeVehicle(String id, String driver, double rate) { super(id,driver,rate); }
    @Override public double calculateFare(double distance) { return getRatePerKm()*distance; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }
}

class AutoVehicle extends Vehicle {
    public AutoVehicle(String id, String driver, double rate) { super(id,driver,rate); }
    @Override public double calculateFare(double distance) { return getRatePerKm()*distance + 10; }
}

public class RideHailing {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
            new CarVehicle("V001","Karan",20),
            new BikeVehicle("V002","Priya",10),
            new AutoVehicle("V003","Raju",8)
        );

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            double fare = v.calculateFare(12.5);
            System.out.println("Fare for 12.5 km: " + fare);
            if (v instanceof GPS) {
                ((GPS)v).updateLocation("MG Road");
                System.out.println("Location: " + ((GPS)v).getCurrentLocation());
            }
            System.out.println();
        }
    }
}

