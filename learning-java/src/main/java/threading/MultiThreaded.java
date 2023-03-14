package threading;

// main method is a thread itself
// daemon thread is the main thread that manages all threads
// deadlock happens when multiple threads are waiting for each other resources


public class MultiThreaded extends Thread {

    public static void main(String[] args) throws InterruptedException {
//        printNumbers();
//        printNumbers2();

        MultiThreaded mt = new MultiThreaded();
        mt.start(); // this will trigger the run method

        for (int i = 1; i < 20; i++) {
            System.out.print("j: " + i + " | ");
            Thread.sleep(200);
        }

    }

    public void run() {
        for (int i = 1; i < 20; i++) {
            System.out.print("i: " + i + " | ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("child thread problem, exiting");
            }
        }
    }
}
