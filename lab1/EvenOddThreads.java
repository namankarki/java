class NumberPrinter {
    private int limit;
    private int current = 1;

    public NumberPrinter(int limit) {
        this.limit = limit;
    }

    public synchronized void printOdd() {
        while (current <= limit) {
            while (current % 2 == 0) {
                try {
                    wait(); // Wait for the even thread to complete
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (current <= limit) {
                System.out.println("Odd: " + current);
                current++;
                notify(); // Notify the even thread
            }
        }
    }

    public synchronized void printEven() {
        while (current <= limit) {
            while (current % 2 != 0) {
                try {
                    wait(); // Wait for the odd thread to complete
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (current <= limit) {
                System.out.println("Even: " + current);
                current++;
                notify(); // Notify the odd thread
            }
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        int limit = 10; // You can change the limit here
        NumberPrinter numberPrinter = new NumberPrinter(limit);

        Thread oddThread = new Thread(numberPrinter::printOdd);
        Thread evenThread = new Thread(numberPrinter::printEven);

        oddThread.start();
        evenThread.start();
    }
}
