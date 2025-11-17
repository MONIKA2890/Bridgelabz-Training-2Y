import java.util.function.Function;

public class MessageLengthChecker {
    public static void main(String[] args) {

        Function<String, Integer> getLength = msg -> msg.length();

        String message = "Hello Functional Interfaces!";
        int limit = 20;

        int length = getLength.apply(message);

        System.out.println("Message Length = " + length);

        if(length > limit) {
            System.out.println("Message exceeds character limit!");
        } else {
            System.out.println("Message within limit.");
        }
    }
}
