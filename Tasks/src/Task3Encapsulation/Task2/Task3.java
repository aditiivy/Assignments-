package Task3Encapsulation.Task2;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultifunctionPrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}


public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultifunctionPrinter obj = new MultifunctionPrinter();
        obj.print();
        obj.scan();

	}

}
