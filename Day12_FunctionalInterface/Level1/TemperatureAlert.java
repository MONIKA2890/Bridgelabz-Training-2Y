import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        double threshold = 40.0;
        Predicate<Double> alert = temp -> temp > threshold;

        double currentTemp = 41.5;

        if(alert.test(currentTemp)) {
            System.out.println("ALERT! Temperature " + currentTemp + "°C exceeds threshold!");
        } else {
            System.out.println("Temperature Normal: " + currentTemp + "°C");
        }
    }
}
