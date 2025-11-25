class InvalidTemperatureException extends Exception {
    InvalidTemperatureException(String msg){ super(msg); }
}

public class TemperatureConverter {
    public static double cToF(double c) throws InvalidTemperatureException {
        if(c < -273.15) throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
        return (c*9/5) + 32;
    }

    public static void main(String[] args) {
        try {
            double f = cToF(-300);
            System.out.println("Temperature in F: " + f);
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}

