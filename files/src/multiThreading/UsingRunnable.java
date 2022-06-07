package multiThreading;

public class UsingRunnable implements Runnable {
    public static void main(String[] args) {
        UsingRunnable myThread = new UsingRunnable();
        Thread thread = new Thread(myThread);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("inside main class");
        }
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("inside runnable thread 1");
        }
    }
}
