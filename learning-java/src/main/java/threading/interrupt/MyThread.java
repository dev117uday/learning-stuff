package threading.interrupt;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("lazy thread");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("thread got interrupted");
        }
    }
}
