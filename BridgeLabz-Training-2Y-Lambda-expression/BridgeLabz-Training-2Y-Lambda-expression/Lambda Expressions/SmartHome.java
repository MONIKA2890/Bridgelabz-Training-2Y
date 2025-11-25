interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {

        // Lambda expressions for different triggers
        LightAction motionDetected = () -> System.out.println("Lights ON - Motion detected!");
        LightAction nightTime = () -> System.out.println("Lights dimmed for night mode.");
        LightAction voiceCommand = () -> System.out.println("Voice command received: Lights OFF");

        // Execute actions dynamically
        motionDetected.execute();
        nightTime.execute();
        voiceCommand.execute();
    }
}