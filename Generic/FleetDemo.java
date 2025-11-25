import java.util.*;


class Vehicle {
    String name;
    Vehicle(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}


class Truck extends Vehicle {
    Truck(String name) { super(name); }
}

class Bike extends Vehicle {
    Bike(String name) { super(name); }
}


class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

  
    void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

   
    void showFleet() {
        System.out.println(fleet);
    }
}


public class FleetDemo {
    public static void main(String[] args) {
       
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Truck A"));
        truckFleet.addVehicle(new Truck("Truck B"));
        System.out.print("Truck Fleet: ");
        truckFleet.showFleet();

     
        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Bike X"));
        bikeFleet.addVehicle(new Bike("Bike Y"));
        System.out.print("Bike Fleet: ");
        bikeFleet.showFleet();
    }
}

