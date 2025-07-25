package TasksOOPS.Task10;

interface Logger { 
default void logInfo() { 
System.out.println("Default Info Log"); 
} 
static void logError() { 
System.out.println("Static Error Log"); 
} 
} 
public class Sample  implements Logger  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample logger = new Sample(); 
		logger.logInfo(); 
		Logger.logError();

	}

}
