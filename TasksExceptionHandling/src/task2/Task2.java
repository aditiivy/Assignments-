package task2;

interface SmartRemoteControl {
    void turnOn();  // Abstract method

    default void batteryStatus() {  // Default method
        System.out.println("Battery is 80% charged.");
    }

    static void info() {  // Static method
        System.out.println("SmartRemoteControl interface for controlling electronic devices.");
    }
}

// Class implementing the interface
class Television implements SmartRemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV is now ON.");
    }
}

// Main class
public class Task2 {
    public static void main(String[] args) {
        Television myTV = new Television();
        myTV.turnOn();               // Abstract method
        myTV.batteryStatus();        // Default method

        SmartRemoteControl.info();   // Static method (called using interface name)
    }
}