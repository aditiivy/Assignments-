package task2;

interface Printable {
    void print();
}

// Second interface
interface Scannable {
    void scan();
}

// Class implementing both interfaces
class MultifunctionPrinter implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Main class
public class Task3 {
    public static void main(String[] args) {
        MultifunctionPrinter mfp = new MultifunctionPrinter();
        mfp.print();
        mfp.scan();
    }
}
