package task2;

//Interface
interface RemoteControl {
 void turnOn();  // Abstract method

 default void batteryStatus() {  // Default method
     System.out.println("Battery is 80% charged.");
 }
}

//Class implementing the interface
class TV implements RemoteControl {
 @Override
 public void turnOn() {
     System.out.println("TV is now ON.");
 }
}

//Main class
public class Task1 {
 public static void main(String[] args) {
     TV myTV = new TV();
     myTV.turnOn();         // Calls abstract method
     myTV.batteryStatus();  // Calls default method
 }
}


