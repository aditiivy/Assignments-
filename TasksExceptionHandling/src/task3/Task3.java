package task3;

final class Constants {
    public static final double PI = 3.14;
    public static final String APP_NAME = "MyApp";
}

// Attempting to extend final class will cause a compile-time error
// class ExtendedConstants extends Constants {
//     // This will result in a compile error
// }


public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of PI: " + Constants.PI);
        System.out.println("Application: " + Constants.APP_NAME);
		

	}

}
