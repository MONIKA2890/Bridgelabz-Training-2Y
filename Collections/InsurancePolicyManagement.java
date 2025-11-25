import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

// Policy Class
class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyholderName() { return policyholderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }

    @Override
    public String toString() {
        return policyNumber + " | " + policyholderName + " | " + expiryDate + " | " + coverageType + " | " + premiumAmount;
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Policy policy = (Policy) obj;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }
}

// Main System
public class InsurancePolicyManagement {
    public static void main(String[] args) {
        // Using HashSet for quick lookups
        Set<Policy> hashSetPolicies = new HashSet<>();

        // Using LinkedHashSet to maintain insertion order
        Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();

        // Using TreeSet to maintain policies sorted by expiry date
        Set<Policy> treeSetPolicies = new TreeSet<>();

        Policy p1 = new Policy("P101", "Alice", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy("P102", "Bob", LocalDate.now().plusDays(40), "Auto", 8000);
        Policy p3 = new Policy("P103", "Charlie", LocalDate.now().plusDays(20), "Home", 7000);
        Policy p4 = new Policy("P101", "Alice", LocalDate.now().plusDays(10), "Health", 5000); // Duplicate

        List<Policy> allPolicies = Arrays.asList(p1, p2, p3, p4);

        // Adding to sets
        for(Policy p : allPolicies) {
            hashSetPolicies.add(p);
            linkedHashSetPolicies.add(p);
            treeSetPolicies.add(p);
        }

        // Display all unique policies
        System.out.println("HashSet Policies (unique, unordered):");
        hashSetPolicies.forEach(System.out::println);

        System.out.println("\nLinkedHashSet Policies (insertion order):");
        linkedHashSetPolicies.forEach(System.out::println);

        System.out.println("\nTreeSet Policies (sorted by expiry date):");
        treeSetPolicies.forEach(System.out::println);

        // Policies expiring within 30 days
        System.out.println("\nPolicies expiring within 30 days:");
        hashSetPolicies.stream()
            .filter(p -> ChronoUnit.DAYS.between(LocalDate.now(), p.getExpiryDate()) <= 30)
            .forEach(System.out::println);

        // Policies with a specific coverage type (e.g., "Health")
        System.out.println("\nPolicies with coverage type 'Health':");
        hashSetPolicies.stream()
            .filter(p -> p.getCoverageType().equalsIgnoreCase("Health"))
            .forEach(System.out::println);

        // Detect duplicate policies based on policy numbers
        Set<String> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies based on Policy Number:");
        allPolicies.stream()
            .filter(p -> !seen.add(p.getPolicyNumber()))
            .forEach(System.out::println);
    }
}

