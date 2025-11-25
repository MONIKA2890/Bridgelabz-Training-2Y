import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int severity; // Higher number → more severe

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other) {
        return other.severity - this.severity; // Descending order
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>();
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");
        while(!triageQueue.isEmpty()) {
            System.out.println(triageQueue.remove());
        }
    }
}
