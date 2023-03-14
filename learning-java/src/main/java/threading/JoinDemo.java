package threading;

public class JoinDemo extends Thread {

    static int sum = 0;

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        JoinDemo jd = new JoinDemo();
        jd.start();

        try {
            jd.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();

        System.out.println("sum : " + JoinDemo.sum);

        System.out.println("time taken : " + (float)(end - start) / 1000);
    }

    public void run() {
        for (int i = 1; i <= 40; i++) {
            JoinDemo.sum = JoinDemo.sum + i;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
