package TasksOOPS.Task8;

abstract class Appliance {
    abstract void turnOn();
}


interface Connectable {
    void connect();
}

class SmartTV extends Appliance implements Connectable {
    @Override
    void turnOn() {
        System.out.println("SmartTV is now ON.");
    }

    @Override
    public void connect() {
        System.out.println("SmartTV connected to Wi-Fi.");
    }
}


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV obj = new SmartTV();
		obj.turnOn();
		obj.connect();
		

	}

}
