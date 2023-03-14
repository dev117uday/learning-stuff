package threading.executor;

public class Runner implements Runnable {

    String name;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " ended " + Thread.currentThread().getName());
    }
}
