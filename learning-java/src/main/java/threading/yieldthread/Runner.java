package threading.yieldthread;

public class Runner {

    public static void main(String[] args) {

        YeildClass ydClass = new YeildClass();
        ydClass.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
