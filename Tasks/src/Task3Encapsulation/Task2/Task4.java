package Task3Encapsulation.Task2;

interface Controllable {
    void turnOn();

    default void status() {
        System.out.println("Device is active.");
    }

    static void deviceInfo() {
        System.out.println("Controllable smart device.");
    }
}

class SmartLight implements Controllable {
    public void turnOn() {
        System.out.println("Smart Light is turned ON.");
    }
}

class SmartSpeaker implements Controllable {
    public void turnOn() {
        System.out.println("Smart Speaker is playing music.");
    }
}


public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartLight light = new SmartLight();
        SmartSpeaker speaker = new SmartSpeaker();

        light.turnOn();
        light.status();

        speaker.turnOn();
        speaker.status();

        Controllable.deviceInfo();

	}

}
