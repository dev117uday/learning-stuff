package threading;

public class AnonRunnable {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anon runnable implementation");
            }
        });

        t.start();
    }
}
