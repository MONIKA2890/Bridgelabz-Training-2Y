class ServiceOverdueException extends Exception {
    ServiceOverdueException(String msg){ super(msg); }
}
class InvalidMileageException extends Exception {
    InvalidMileageException(String msg){ super(msg); }
}

class Vehicle {
    int mileage;
    boolean serviceOverdue;

    Vehicle(int mileage, boolean serviceOverdue){
        this.mileage = mileage;
        this.serviceOverdue = serviceOverdue;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if(mileage < 0) throw new InvalidMileageException("Mileage cannot be negative!");
        if(serviceOverdue) throw new ServiceOverdueException("Service is overdue!");
        System.out.println("Vehicle is in good condition.");
    }
}

public class vehicleTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(15000, true);
        try {
            v.checkMaintenance();
        } catch (ServiceOverdueException | InvalidMileageException e) {
            System.out.println(e.getMessage());
        }
    }
}

