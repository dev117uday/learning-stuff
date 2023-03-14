package threading;

public class RunnableInterface implements Runnable {

    public static void main(String[] args) {
        var runn = new RunnableInterface();

        Thread t = new Thread(runn);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
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
