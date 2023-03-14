package threading;

public class ThreadIdentity extends Thread {

    public static void main(String[] args) throws InterruptedException {

        ThreadIdentity mt = new ThreadIdentity();
        mt.setPriority(MAX_PRIORITY);
        // 1-10
        mt.start();

        ThreadIdentity mt2 = new ThreadIdentity();
        mt2.setPriority(MIN_PRIORITY);
        // 1-10
        mt2.start();

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());

    }

    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());
    }
}
