package task5;



public class Task4 {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int result = numbers[3] / 0;  // This will throw ArrayIndexOutOfBoundsException first
            System.out.println("Result: " + result);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } 
        finally {
            System.out.println("Program ended with exception handling.");
        }
    }
}
