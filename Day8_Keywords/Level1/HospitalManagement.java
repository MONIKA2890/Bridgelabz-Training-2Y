class Patient {
   
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    
    private String name;
    private int age;
    private String ailment;
    private final int patientID; 

   
    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

   
    void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("-------------------------------");
    }

  
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}


public class HospitalManagement {
    public static void main(String[] args) {
        
        Patient p1 = new Patient("Raj Sharma", 30, "Fever", 101);
        Patient p2 = new Patient("Simran Kaur", 45, "Diabetes", 102);

        
        if (p1 instanceof Patient) {
            p1.displayDetails();
        }

        if (p2 instanceof Patient) {
            p2.displayDetails();
        }

        
        Patient.getTotalPatients();
    }
}

