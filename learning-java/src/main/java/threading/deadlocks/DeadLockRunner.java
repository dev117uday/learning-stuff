package threading.deadlocks;

public class DeadLockRunner implements Runnable {

    FirstResources firstResources = new FirstResources();
    SecondResources secondResources = new SecondResources();

    public DeadLockRunner() {
        new Thread(this).start();
        secondResources.method1(firstResources);
    }

    public static void main(String[] args) {
        new DeadLockRunner();
    }

    @Override
    public void run() {
        firstResources.method1(secondResources);
    }
}
