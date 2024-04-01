import java.util.Scanner;

class CounterThread extends Thread {
    private int lower;
    private int upper;
    private String threadName;

    public CounterThread(int lower, int upper, String threadName) {
        this.lower = lower;
        this.upper = upper;
        this.threadName = threadName;
    }

    public void run() {
        for (int i = lower; i <= upper; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lower = scanner.nextInt();

        System.out.print("Enter upper range: ");
        int upper = scanner.nextInt();

        System.out.print("Enter thread name: ");
        String threadName = scanner.next();

        CounterThread counterThread = new CounterThread(lower, upper, threadName);
        counterThread.start();
    }
}