interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available for this vehicle");
    }
}

class PetrolCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 90 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 70 km/h");
    }

    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

public class VehicleDashboard {
    public static void main(String[] args) {

        Vehicle car = new PetrolCar();
        Vehicle tesla = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        tesla.displaySpeed();
        tesla.displayBattery();
    }
}

