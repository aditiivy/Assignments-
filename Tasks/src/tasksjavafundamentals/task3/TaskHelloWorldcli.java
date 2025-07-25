package tasksjavafundamentals.task3;

public class TaskHelloWorldcli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
            System.out.println("Today is a great day to code Java!");
        } else {
            System.out.println("Please provide your name as a command-line argument.");
        }

	}

}
