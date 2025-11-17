interface Rentable {
    void rent();
    void returnVehicle();
}
class Car implements Rentable {
    public void rent() {
        System.out.println("Car rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Car returned successfully.");
    }
}
class Bike implements Rentable {
    public void rent() {
        System.out.println("Bike rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Bike returned successfully.");
    }
}
class Bus implements Rentable {
    public void rent() {
        System.out.println("Bus rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Bus returned successfully.");
    }
}
public class RentalSystem {
    public static void main(String[] args) {

        Rentable car = new Car();
        Rentable bike = new Bike();
        Rentable bus = new Bus();

        car.rent();
        car.returnVehicle();

        bike.rent();
        bike.returnVehicle();

        bus.rent();
        bus.returnVehicle();
    }
}

