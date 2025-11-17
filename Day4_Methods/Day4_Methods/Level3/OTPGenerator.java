import java.util.Random;

public class OTPGenerator {
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // Generates a number between 100000 and 999999
    }
    
    // Method to verify OTP
    public static boolean verifyOTP(int generatedOTP, int enteredOTP) {
        return generatedOTP == enteredOTP;
    }
    
    // Test the methods
    public static void main(String[] args) {
        int otp = generateOTP();
        System.out.println("Generated OTP: " + otp);
        
        // Simulate user entering OTP (for testing, we'll use the same OTP)
        int enteredOTP = otp;
        
        if (verifyOTP(otp, enteredOTP)) {
            System.out.println("OTP verification successful!");
        } else {
            System.out.println("OTP verification failed!");
        }
    }
}