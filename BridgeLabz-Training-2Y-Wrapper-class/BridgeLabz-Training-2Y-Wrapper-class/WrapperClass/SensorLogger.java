public class SensorLogger {
    public static void logData(double tempPrimitive, Double tempWrapper) {
        System.out.println("Primitive data logged: " + tempPrimitive);
        System.out.println("Wrapper data logged: " + tempWrapper);
    }

    public static void main(String[] args) {
        double temp = 36.6;
        Double wrapperTemp = temp;  // Auto-boxing
        logData(temp, wrapperTemp); // Both accepted
    }
}

