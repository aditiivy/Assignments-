package task5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            File file = new File("example.txt");  
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner closed in finally block.");
            }
        }
    }
}

