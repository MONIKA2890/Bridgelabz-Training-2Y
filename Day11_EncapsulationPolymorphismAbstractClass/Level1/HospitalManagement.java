
import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) { this.patientId = patientId; this.name = name; this.age = age; }
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println(patientId + " - " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String rec);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private List<String> records = new ArrayList<>();
    public InPatient(String id, String name, int age, int days) { super(id,name,age); this.daysAdmitted=days; }
    @Override public double calculateBill() { return daysAdmitted * 2000 + 5000; }
    @Override public void addRecord(String rec) { records.add(rec); }
    @Override public List<String> viewRecords() { return Collections.unmodifiableList(records); }
}

class OutPatient extends Patient {
    private int consultations;
    public OutPatient(String id, String name, int age, int consultations) { super(id,name,age); this.consultations=consultations; }
    @Override public double calculateBill() { return consultations * 500; }
}

public class HospitalManagement {
    public static void main(String[] args) {
        InPatient p1 = new InPatient("P001","Sana",30,5);
        p1.addRecord("Admitted for appendicitis");
        p1.addRecord("Appendectomy performed");

        OutPatient p2 = new OutPatient("P002","Amit",40,2);

        List<Patient> patients = Arrays.asList(p1, p2);
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                System.out.println("Records: " + ((MedicalRecord)p).viewRecords());
            }
            System.out.println();
        }
    }
}

