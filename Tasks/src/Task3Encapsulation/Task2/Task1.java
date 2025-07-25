package Task3Encapsulation.Task2;

interface RemoteControl {
    void turnOn(); // abstract method

    default void batteryStatus() {
        System.out.println("Battery is 80% charged.");
    }
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is now ON.");
    }
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV obj = new TV();
        obj.turnOn();
        obj.batteryStatus();

	}

}
