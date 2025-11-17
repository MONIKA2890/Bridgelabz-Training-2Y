interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON"); }
    public void turnOff(){ System.out.println("Light turned OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC started"); }
    public void turnOff(){ System.out.println("AC stopped"); }
}

public class Smart {
    public static void main(String[] args) {
        SmartDevice device = new Light();
        device.turnOn();
        device.turnOff();
    }
}
