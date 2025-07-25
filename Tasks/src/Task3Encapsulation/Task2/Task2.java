package Task3Encapsulation.Task2;

interface Remote {
    void turnOn();

    default void batteryStatus() {
        System.out.println("Battery status OK.");
    }

    static void info() {
        System.out.println("RemoteControl interface for electronic devices.");
    }
}

class TeleVision implements Remote {
    public void turnOn() {
        System.out.println("TV turned on.");
    }
}

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeleVision obj = new TeleVision();
        obj.turnOn();
        obj.batteryStatus();
        Remote.info(); // static method called using interface name

	}

}
