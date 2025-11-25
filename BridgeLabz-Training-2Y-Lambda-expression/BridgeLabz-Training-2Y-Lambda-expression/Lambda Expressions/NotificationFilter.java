import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Critical", "Patient heart rate abnormal"),
                new Alert("Normal", "Patient temperature stable"),
                new Alert("Urgent", "Low oxygen detected")
        );

        // Predicate using lambda to filter only critical and urgent alerts
        Predicate<Alert> showImportant = a -> a.type.equals("Critical") || a.type.equals("Urgent");

        System.out.println("Filtered Alerts:");
        alerts.stream()
                .filter(showImportant)
                .forEach(System.out::println);
    }
}
