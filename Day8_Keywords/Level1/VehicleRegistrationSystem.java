class Vehicle {
    static double registrationFee = 5000;

    
    String ownerName;
    String vehicleType;
    final String registrationNumber; 

    
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    
    void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {   
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Invalid object! Not a Vehicle.");
        }
    }
}


public class VehicleRegistrationSystem {
    public static void main(String[] args) {
       
        Vehicle v1 = new Vehicle("Amit", "Car", "REG123");
        Vehicle v2 = new Vehicle("Riya", "Bike", "REG456");

       
        v1.displayDetails(v1);
        v2.displayDetails(v2);

        
        Vehicle.updateRegistrationFee(6000);

        
        v1.displayDetails(v1);
        v2.displayDetails(v2);

        
        String test = "Not a vehicle";
        v1.displayDetails(test);  
    }
}

