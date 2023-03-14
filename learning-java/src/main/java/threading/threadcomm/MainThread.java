package threading.threadcomm;

public class MainThread {

    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.start();

        synchronized (t) {
            try {
                System.out.println("main thread going to wait");
                t.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("main thread notified");
            System.out.println(t.total);
        }

    }
}
