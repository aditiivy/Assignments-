package tasksjavafundamentals.task4;

public class Sample1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
        int max = 100;
        boolean isEven = number % 2 == 0;

        if (isEven) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        for (int i = 0; i < number; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("\nLoop finished.");
        System.out.println("Value of max is "+ max);

        switch (number) {
            case 10:
                System.out.println("Number is ten");
                break;
            default:
                System.out.println("Other number");
        }

	}

}
