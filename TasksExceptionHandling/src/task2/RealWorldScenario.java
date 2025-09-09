package task2;

//Interface
interface Controllable {
 void turnOn();  // Abstract method

 default void status() {
     System.out.println("Device status: Operational.");
 }

 static void deviceInfo() {
     System.out.println("Smart Device supports remote access.");
 }
}

//Smart device class 1
class SmartLight implements Controllable {
 @Override
 public void turnOn() {
     System.out.println("Smart Light is turned ON.");
 }
}

//Smart device class 2
class SmartFan implements Controllable {
 @Override
 public void turnOn() {
     System.out.println("Smart Fan is turned ON.");
 }
}

//Main class
public class RealWorldScenario {
 public static void main(String[] args) {
     SmartLight light = new SmartLight();
     SmartFan fan = new SmartFan();

     light.turnOn();
     light.status();  // Default method

     fan.turnOn();
     fan.status();

     Controllable.deviceInfo();  // Static method via interface
 }
}