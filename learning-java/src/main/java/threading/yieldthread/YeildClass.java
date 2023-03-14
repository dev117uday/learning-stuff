package threading.yieldthread;

public class YeildClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
            Thread.yield();
            // child thread waits for main thread to stop
        }
    }
}
